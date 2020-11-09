#include <iostream>
using namespace std;


// Question 2: Try commenting out your check for NULL pointers in the previous question and see what
// your program does. What is happening and why?

// Answer: The programme errors out when it tries to print out the value of pointerArray[2] in the first loop. 
// This is because on most operating systems programs are not allowed to access memory at address 0 as it's 
// reserved by the operating system. Setting a pointer to NULL sets its memory addresss to 0 which signals that 
// the pointer is not intended to point to an accessible memory location.


// If I instead comment out the NULL check in the second loop which deallocates memory at each array index, this
// has no effect on the programme.

int main()
{
  int * pointerArray[4];

  pointerArray[0] = new int;
  pointerArray[1] = new int;
  pointerArray[2] = NULL;
  pointerArray[3] = new int;

  *(pointerArray[0]) = 1;
  *(pointerArray[1]) = 10;
  *(pointerArray[3]) = 50;

  // Question 1: Loop to print pointerArray integer values
  for (int i = 0; i < 4; i++) {
    if (pointerArray[i] == NULL) { continue; }
    cout << *pointerArray[i] << endl;
  }
  
  // Question 1: Loop to deallocate each index value 
  for (int i = 0; i < 4; i++) {
    if (pointerArray[i] == NULL) { continue; }
    delete pointerArray[i];
    pointerArray[i] = NULL;
  }
  
  return 0;
}
