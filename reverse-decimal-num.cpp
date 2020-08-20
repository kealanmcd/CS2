#include <iostream>
#include <cmath>

using namespace std;


// This function is acting as a black box because:
// The output of the program is expected - The function name `reverseDecimalNum` expects an input of
// of a decimal number and then output the reverse of it.
// All the code used to execute this task is enclosed within the function.
int reverseDecimalNum(int number)
{
  int reversedNum = 0, rem;
  while(number != 0)
  {
    rem = number % 10;
    reversedNum = reversedNum * 10 + rem;
    number /= 10;
  }

  return reversedNum;
}

int main()
{
  
  cout << 21 << " reversed is " << reverseDecimalNum(21) << endl;
  cout << 844 << " reversed is " << reverseDecimalNum(844) << endl;
  cout << 3401 << " reversed is " << reverseDecimalNum(3401) << endl;
  
  return 0;
}