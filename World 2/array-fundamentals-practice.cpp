// Question 1 - isSorted

#include <iostream>
#include <string>
using namespace std;

bool isSorted(int array[], int numItems) 
{
  if (numItems == 1) { return true; }

  int index = 1; 
  while (array[index] < array[index-1] && index < numItems) {
    if (array[index] < array[index-1]) { 
      return false; 
    }
    index++;
  }

  return true;
}

int main()
{
  const int arraySize = 7;	
  int integerArray[arraySize] = {4, 2, 4, 5, 6, 7, 8};	
  cout << "isSorted returned " << isSorted(integerArray, arraySize);
}





/*  ========================================================================= 
    =========================================================================  */


// Question 2 - countUppercaseChars

#include <iostream>
#include <string>
using namespace std;

int countUppercaseChars(char arr[], int arr_size) 
{
  int uppercaseChars = 0;
  for (int i = 0; i < arr_size; i++) {
    int charCode = arr[i] + 0;
    if (charCode >= 65 && charCode <= 90) {
      uppercaseChars += 1;
    }
   }

  return uppercaseChars;
}

int main()
{
  const int arraySize = 10;	
  char charArray[arraySize] = {'a', 'b', 'C', 'D', 'e', 'F', 'g', 'h', 'i', 'l'};	
  cout << "There are " << countUppercaseChars(charArray, arraySize) << " uppercase characters in the array";
}
