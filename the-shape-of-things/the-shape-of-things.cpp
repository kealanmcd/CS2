#include<iostream>
using namespace std;


void outputRow (int initSpace, int hashes, int rows, int minMidSpaceLength) {
    
  int midSpaceLength = minMidSpaceLength + (rows - hashes - 1) * 4; // space characters between hashes (apart from the two middle rows)
  int rowLength = initSpace + hashes * 2 + midSpaceLength;  // total length of characters to be outputted on the current row
 
  int initMidSpaceIndex = initSpace + hashes;   // index position of the first space character to show after the first series of hashes  
  int endMidSpaceIndex = initMidSpaceIndex + midSpaceLength;  // index position of the last character to show before the second series of hashes
  
  // forloop to output all the space and hash characters in every row
  for (int i = 0; i < rowLength; i++) {
      
    // returns true if not the middle two rows and 'i' is an index value between hashes
    bool betweenHashes = midSpaceLength > rows - 1 && (i >= initMidSpaceIndex && i < endMidSpaceIndex);
    
    // output a hash character if 'i' is not at an index of a space character
    if (i < initSpace || betweenHashes) {
      cout << ' ';
    } else {
      cout << '#';
    }
  }
  
  cout << '\n';
}

int main() {
    
  int rows = 5;     // this variable is used to define the amount of upper and lower rows hash characters and space characters
  int hashes = 1;   // the initial and final rows will output only one hash between the space characters
  int minMidSpaceLength = rows < 4 ? 4 : rows;  // the minimum amount of space characters to show between hashes apart from the middle rows should be 4 or higher
  
  // forloop to print upper half 
  for (int i = 0; i < rows * 2; i++) {
    int preHashSpaces = i;   
    
    if (i < rows) {
      outputRow(preHashSpaces, hashes, rows, minMidSpaceLength);
      hashes++;
    } else {
      preHashSpaces = (rows * 2) - i - 1; // space characters before the first series of hashes will decrement after the first set of rows is printed
      hashes--;
      outputRow(preHashSpaces, hashes, rows, minMidSpaceLength);
    }
  }

  return 0;
}