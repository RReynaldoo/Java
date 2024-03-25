//******************************************Tests that return true or false, used for desicions and conditions**************************************************************** */

//For str and chr
Character.isUpperCase(ch);  //Checks if is uppercase
Character.toUpperCase(ch);  //Uppercases it 
Character.isLowerCase(ch2); //Checks if is lowercase
Character.toLowerCase(ch2); //Lowercases it

Character.length()          //To get the length of a string starting at 0. (more efficient than comparing and better to identify if the user didnt type any input)

//All
Character.getNumericValue('5'); //Get numeric value from what is introduced
Character.isLetter('z');        //Checks if it is a letter
Character.isLetterOrDigit('%'); //Checks if its letter or digit
Character.isWhitespace(' ');    //Checks if it is whitespace

//--------------------------To compare strings use this in the argument of the condition ex: if(here)-------------------------------------

aString.equalsIgnoreCase(String)        //Evaluates taking into consideration the case of the letters
aString.equeals(aString);               //Evaluates regardless of the case of the letters

//--------------------------Declaring strings-------------------------------------

String Fred;            //same as setting it null, the string lacks content so it cant be compared but can be use. similar to int x;
String Fred = "";       //Sets it as empty. It would be equivalent to int x = 0;