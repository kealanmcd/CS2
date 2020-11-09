#include <iostream>
using namespace std;
#include <stdlib.h>
#include <sstream>

struct song 
{
  string title;
  string artist;
  int year;
};

// Function to output all attributes of a "song" struct in a single line
string songToString(song s) 
{
  stringstream songString;
  songString << s.title << " - " << s.artist << " (" << s.year << ")";
  string stringformat = songString.str();
  return stringformat;
};

// Function to return an array of pointers that point to "song" structs of a given "year"
song** songsFromYear(song **songs, int size, int year, int *resultSize) 
{
  
  // Loop through array of "song" structs to count the number of "songs" that are from a specific "year"
  for (int i = 0; i < size; i++) {
    if (songs[i]->year == year) {
      *resultSize += 1;
    }
  }

  song ** returnedSongsArr = new song*[*resultSize];        // Create a new array of "song" pointers.
  int songPosition = 0;                                     // songPosition will track the correct index position in the "returnedSongsArr" to add a pointer for each relevant "song" struct
  int index = 0;                                            // "index" to iterate through all the index positions in the "songs" array until all relevant songs are found
  
  // loop through the "songs" array again and add pointers to each relevant song in the "returnedSongsArr"
  while(songPosition != *resultSize ) {
    if (songs[index]->year == year) {
      returnedSongsArr[songPosition] = songs[index];
      songPosition++;
    }
    
    index++;
  }
  
  return returnedSongsArr;
};


int main()
{
  int songsSize = 5;
  song ** songsArray = new song*[songsSize];
  songsArray[0] = new song;
  songsArray[0]->title = "Dani California";
  songsArray[0]->artist = "Red Hot Chili Peppers";
  songsArray[0]->year = 2006;
 
  songsArray[1] = new song;
  songsArray[1]->title = "Hungry Like the Wolf";
  songsArray[1]->artist = "Duran Duran";
  songsArray[1]->year = 1982;
 
  songsArray[2] = new song;
  songsArray[2]->title = "Snow (Hey Oh)";
  songsArray[2]->artist = "Red Hot Chili Peppers";
  songsArray[2]->year = 2006;
 
  songsArray[3] = new song;
  songsArray[3]->title = "Gypsy";
  songsArray[3]->artist = "Fleetwood Mac";
  songsArray[3]->year = 1982;
 
  songsArray[4] = new song;
  songsArray[4]->title = "Bones";
  songsArray[4]->artist = "Killers";
  songsArray[4]->year = 2006;

  // Output the details from each song struct as a single string
  for (int i = 0; i < songsSize; i++) {
   cout << songToString(*songsArray[i]) << endl;
  }
  
  cout << endl;
  
  
  int *returnedSongsSize = new int(0);      // Declare a pointer integer to be used in returning the amount of songs found for the given year
  int songYear = 1982;                      // The year to check for songs on the "songsArray"

   // Call the "songsFromYear" function to build an array of pointers that point to song structs in "songsArray" from the given year.
  song ** songsFromYearArray = songsFromYear(songsArray, songsSize, songYear, returnedSongsSize);
  
  // Check if the "songsFromYearArray" contains any songs. If it does, print out each song found. Otherwise tell the user that no songs were found from the given year.
  if (*returnedSongsSize > 0) {
    cout << "The following songs have been found from the year " << songYear << ':' << endl;
    for (int i = 0; i < *returnedSongsSize; i++) {
      cout << songToString(*songsFromYearArray[i]) << endl;
    }
    
  } else {
    cout << "Sorry, no songs from the year " << songYear << " were found." << endl;
  }

  // Deallocate the memory of each struct in the "songsArray"
  for (int i = 4; i < songsSize; i++) {
    delete songsArray[i];
    songsArray[i] = NULL;
  }
  
  // Deallocate "songsFromYearArray" and set its pointers to NULL
  for (int i = 0; i < *returnedSongsSize; i++) {
    delete songsFromYearArray[i];
    songsFromYearArray[i] = NULL;
  }
  
  delete returnedSongsSize;
  delete [] songsFromYearArray;
  delete [] songsArray;

  return 0;
}