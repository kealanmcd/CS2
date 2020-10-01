#include <iostream>
using namespace std;
#include <math.h>

struct domino {
  int first;
  int last;
};

// Function used to fill the double-six set array
void buildDoubleSixSet(domino * array)
{

  int arrayIndex; int topInt; int bottomInt;
  while (topInt != 7 && bottomInt != 7) {

    domino Domino = {
      topInt,
      bottomInt
    };

    if (topInt == bottomInt) {
      bottomInt++;
      topInt = 0;
      cout << endl;
    } else {
      topInt++;
    }
    
    array[arrayIndex] = Domino;
    arrayIndex++;
  }
}

// Insertion sort is used to sort the domino array in ascending order by looking at the total value that each domino makes up.
// EG. [2,4] = 6;  [1,4] = 5 etc.
void insertionSort(domino array[], int arraySize)
{
  int i, j;
  domino key;
  for (i = 1; i < arraySize; i++) {
    key = array[i];
    j = i - 1;
  
    while (j >= 0 && (array[j].first + array[j].last) > (key.first + key.last)) {  // algorithm looks and compares the total of the top and bottom values of each domino
      array[j + 1] = array[j];
      j = j - 1;
    }
    
    array[j + 1] = key;
  }
}

// Function used to output the pattern of each half of the domino. Each half is made up of 9 spaces or a 3x3 grid
void outputDomino(int number, string dominoHalf)
{

  // Print the top layer of the domino first if we're outputting the upper half of the domino
  if (dominoHalf == "upper") {
    cout << " ___ " << endl;
  }

  double key = 9.0 / number;    // The amount of times "number" can be divided into 9 is used to formulate where to output each "*"

  int dot = 1;            // "dot" represents the current "*" that needs to be outputted and is incremented each time the index position for each "*" is found. Each time the the poisition of "*" is found, the "dot" value increases.
  int offset = 0;         // If outputing the pattern for numbers [1-4], these require an initial offset value in find it's correct index position
  if (number < 5) {
    offset = number - 5;
  }

  for (int i = 1; i < 10; i++) {
    if (i % 3 == 1) { cout << "|"; }            // Prints the left side of the domino using a "|" character

    if (number == 4 && dot == 3) {
      offset = 1;
    } else if (number == 4 && dot == 4 || number == 2 && dot == 2) {
      offset = 0;
    }

    if (i == floor(key * dot) + offset) {       // Print a "*" character when its correct index position is found
      cout << "*";
      dot++;
      if (number == 3) { offset += 1; }
    } else {
      cout << " ";
    }
    if (i % 3 == 0) { cout << "|" << endl; }    // prints the right side of the domino using a "|" character
  }


  // If we're outputting the upper half of the domino, print the divider between the upper and lower half
  if (dominoHalf == "upper") {
    cout << "|---|" << endl;
  } else {
    cout << " --- " << endl;
  }
}

int main()
{

  int dominoArraySize = 27;
  domino dominoArray[dominoArraySize];
  buildDoubleSixSet(dominoArray);

  
  cout << "Built Domino Array" << endl;
  for (int i = 0; i < dominoArraySize; i++)  {
    outputDomino(dominoArray[i].first, "upper");
    outputDomino(dominoArray[i].last, "lower");
  }

  insertionSortUpper(dominoArray, dominoArraySize);

  cout << "Sorted Domino Array" << endl;
  for (int i = 0; i < dominoArraySize; i++)  {
    outputDomino(dominoArray[i].first, "upper");
    outputDomino(dominoArray[i].last, "lower");
  }
}
