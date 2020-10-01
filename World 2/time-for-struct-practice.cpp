#include <iostream>
using namespace std;

struct Time
{
  int hour;
  int minute;
  int second;
  string format;
};

// Convert the passed in Time struct into "seconds" format
int countTimeInSeconds(Time currentTime)
{
  int currentFormat = (currentTime.format == "PM" && currentTime.hour != 12) ? 12 : 0;
  int timeInSeconds = currentTime.second + (currentTime.minute * 60) + ((currentTime.hour + currentFormat) * (60 * 60));
  return timeInSeconds;
}

// Function to double the passed in Time struct. It converts the time to a 24hr clock
// format, doubles the 24hr time and then converts it back into digital format
void doubleDigitalTime(Time& currentTime)
{
  
  // Double the "second" parameter value and if the value is greater than 60, assign "incrementTimeSec" to 1 as this value
  // will need to be added to the doubled "minute" parameter
  int incrementTimeSec =  currentTime.second * 2 >= 60 ? 1 : 0;
  currentTime.second = (currentTime.second * 2) % 60;


  // Double the "minute" paramater value, assign "incrementTimeMinute" to 1 if the doubled minute is greater than 60
  int incrementTimeMinute = currentTime.minute * 2 + incrementTimeSec >= 60 ? 1 : 0;
  currentTime.minute = (currentTime.minute * 2 + incrementTimeSec) % 60;
   
  // Double the value of the hour value
  int doubledHour = ((currentTime.hour * 24) / 12) + incrementTimeMinute;
  
  if (doubledHour > 12 && doubledHour < 24) {    // The doubled hour is a "PM" value
    currentTime.hour = doubledHour % 12;
    currentTime.format = "PM";
  } else if (doubledHour <= 1 || doubledHour == 12) {   // The doubled hour is either 12pm or 1pm
    currentTime.hour = 12 + incrementTimeMinute;
    currentTime.format = "PM";
  } else {
    currentTime.hour = doubledHour % 12;         // The doubled hour is an "AM" value
    currentTime.format = "AM";
  }
}

// Function to output the next meal time in relation to the time passed into the function
Time nextMealTime(Time currentTime) 
{
  int dailyMeals = 4;
  Time mealTimes[dailyMeals] = {
    {8, 0, 0, "AM"},    // Breakfast 8:00am
    {12, 0, 0, "PM"},   // Lunch: 12pm;
    {5, 0, 0, "PM"},    // Dinner: 5pm;
    {7, 0, 0, "PM"}     // Afternoon Tea: 7pm
  };
    
  int firstMealTimeDiff = countTimeInSeconds(mealTimes[0]) - countTimeInSeconds(currentTime);
  int nextMealTime;
  int nextMealIndex = 0;
  int currentTimeInSeconds = countTimeInSeconds(currentTime);


  if (firstMealTimeDiff < 0) {
    nextMealTime = (24 * 60 * 60) + firstMealTimeDiff;
  } else {
    nextMealTime = firstMealTimeDiff;
  }
    
  for (int i = 1; i < dailyMeals; i++) {
    int tempTimeSeconds = countTimeInSeconds(mealTimes[i]);   
    if (tempTimeSeconds < currentTimeInSeconds) { continue; }

    if ((tempTimeSeconds - currentTimeInSeconds) < nextMealTime) {
      nextMealIndex = i;
      nextMealTime = tempTimeSeconds - currentTimeInSeconds;
    }
  }
  
  return mealTimes[nextMealIndex];
}


int main()
{
  Time currentTime = { 1, 42, 0, "PM" };
  cout << "Part 1: Pass by reference (double time function)" << endl;
  cout << "Current: " << currentTime.hour << ":" << currentTime.minute << ":" << currentTime.second << " " << currentTime.format << endl;
  doubleDigitalTime(currentTime);
  cout << "Doubled time: " << currentTime.hour << ":" << currentTime.minute << ":" << currentTime.second << " " << currentTime.format << endl;
  cout << endl;
    
    
  /* Part 2: Pass by value to blackbox loop (next meal time function) */
  cout << "Part 2: Pass by value loop (next meal time function)" << endl;
  int timeArraySize = 10;
  Time digitalTimes[timeArraySize] = {
    {0, 0, 0, "AM"},
    {2, 0, 0, "AM"},
    {4, 0, 0, "AM"},
    {6, 0, 0, "AM"},
    {8, 0, 0, "AM"},
    {10, 0, 0, "AM"},
    {12, 0, 0, "PM"},
    {4, 0, 0, "PM"},
    {6, 0, 0, "PM"},
    {8, 0, 0, "PM"}
  };
    
  for (int i = 0; i < timeArraySize; i++) {
    cout << "It's currently " << digitalTimes[i].hour << ":" << digitalTimes[i].minute << ":" << digitalTimes[i].minute << " " << digitalTimes[i].format << ". ";
    Time nextMeal = nextMealTime(digitalTimes[i]);
    
    // If the returned "nextMeal" is equal to the initial time given, then alter the user to eat now
    if (countTimeInSeconds(digitalTimes[i]) == countTimeInSeconds(nextMeal)) {
      cout << "You should be eating now" << endl;
    } else {
      cout << "Your next meal is at " << nextMeal.hour << ":" << nextMeal.minute << ":" << nextMeal.second << " " << nextMeal.format  << endl;
    }
  }
    
  return 0;
}