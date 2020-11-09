#include <iostream>
using namespace std;
#include <stdlib.h>

struct soda
{
  int gramsOfSugar;
  float gramsOfCarbonation;
};


int main()
{
  soda **sodaArray = new soda*[3];
  
  for (int i = 0; i < 3; i++) {

    // create a new soda pointer at each index in the sodaArray. Fill "gramsOfSugar" and
    // "gramsOfCarbonation" with random values.
    sodaArray[i] = new soda;
    sodaArray[i]->gramsOfSugar = int(rand() % 100);
    sodaArray[i]->gramsOfCarbonation = float((rand() % 100) / 34.3);
  
    cout << sodaArray[i]->gramsOfSugar << endl;
    cout << sodaArray[i]->gramsOfCarbonation << endl;
    cout << endl;
  
    // deallocate each array index of sodaArray
    delete sodaArray[i];
    sodaArray[i] = NULL;
  }
 
  // deallocate the sodaArray
  delete [] sodaArray;
  sodaArray = NULL;
 
  return 0;
}