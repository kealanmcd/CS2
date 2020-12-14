#include <iostream>
using namespace std;

float getAverageScore(int scoreArray[], int size) {
  float total = 0;
  for (int i = 0; i < size; i++)
  {
    total += scoreArray[i];
  }
  return total / size;
}


int main()
{
  const int ARRAY_SIZE = 10;
  int scores[ARRAY_SIZE];
 
  for (int i = 0; i < ARRAY_SIZE; i++)
  {
    if (i % 2 == 0) {
      scores[i] = i;
    } else {
      scores[i] = 0;
    }
  }
 
  cout << "Average score: " << getAverageScore(scores, ARRAY_SIZE) << endl;
   
  return 0;
}