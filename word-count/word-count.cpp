// Example program
#include <iostream>
using namespace std;

int main() {
  
  int totalWordCount = 0;       // Holds the total number of words in input
  int longestWordCharCount = 0; // Stores the length of the longest word
  int currentWordCharCount = 0; // Stores the length of the current word
  
  int currentWordVowelCount = 0;  // Stores the maximum number of vowels in current word
  int largestVowelCount = 0;      // Stores the number for the max number of vowels found in a word
  char inputChar;                 // Holds the currently viewed input character from sentence
  int number;                     // Variable that will hold the ASCII number of each character
  
  int vowels[5] = {65, 69, 73, 79, 85}; // An array of uppercased vowels in the ASCII Character Set
  
  
  enum charType {VALID, INVALID};   // Will be used to determine if the previously viewed character is "whitespace" or "alphabetical"
  charType charValidity = VALID;
  
  
  cout << "Input a sentence consisting of alphabetical characters only: " << endl;
  cout << "> ";
  
  do {
      
    inputChar = cin.get();
    number = inputChar + 0; // Convert character to ASCII number
    
    // Check if the inputted character is uppercased or lowercased
    bool uppercaseChar = (number >= 65 && number <= 90) ? true : false;
    bool lowercaseChar = (number >= 97 && number <= 122) ? true : false; 
    
    // If inputted character is alphabetical and proceeds either a whitespace character or another alphabetic character
    if (charValidity == VALID && (uppercaseChar || lowercaseChar)) {
      currentWordCharCount += 1;
      
      // Check if alphabetic character is a vowel. You can find an uppercased characters lowercased equivalent
      // by adding 32 to it, so here we are checking if the character is an upper or lowercased vowel
      for (int i = 0; i < 5; i++) {
        if (number == vowels[i] || number == vowels[i] + 32) {
          currentWordVowelCount += 1;
          break;
        }
      }
    
    } else {
      // Check if characters ASCII equals that of whitespace or the enter key
      if (number == 32 || number == 10) {
        charValidity = VALID;
        
        // Check if the vowel count of the current exceeds all previous words in the sentence   
        if (currentWordVowelCount > largestVowelCount) {
          largestVowelCount = currentWordVowelCount;
        }
      
        // Check if character count of the current word exceeds that of all previous words in the sentence
        if (currentWordCharCount > longestWordCharCount) { 
          longestWordCharCount = currentWordCharCount; 
        }

      } else {
        charValidity = INVALID;
        currentWordCharCount = 0;
        currentWordVowelCount = 0;
      }
      
      if (currentWordCharCount > 0) {
        totalWordCount += 1;
        currentWordCharCount = 0;
        currentWordVowelCount = 0;
      }
      
    }
  } while (inputChar != 10);
  
  cout << "Total number of words found is " << totalWordCount << endl;
  cout << "The longest word count is " << longestWordCharCount << endl;
  cout << "The most vowels found in a single word is " << largestVowelCount << endl;
  
  return 0;
}