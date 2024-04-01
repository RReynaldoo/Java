//******************************************Tests that return true or false or numeric values, used for desicions and conditions**************************************************************** */

//For str and chr
Character.isUpperCase(ch);  //Checks if is uppercase
Character.toUpperCase(ch);  //Uppercases it 
Character.isLowerCase(ch2); //Checks if is lowercase
Character.toLowerCase(ch2); //Lowercases it
Character.getNumericValue(); //Get numeric value from what is introduced
Character.isLetter();        //Checks if it is a letter
Character.isLetterOrDigit(); //Checks if its letter or digit
Character.isWhitespace();    //Checks if it is whitespace

Character.length()          //To get the length of a string starting at 0. (more efficient than comparing and better to identify if the user didnt type any input)
Character.indexOf()         //determines whether a specific character occurs within a String. If it does, the method returns the position of the character
Character.charAt()          //requires an integer argument that indicates the position of the character that the method returns, starting with 0
//You can put this into things like: input.nextLine().charAt(2)
Character.endsWith() / startsWith()     //each take a String argument and return true or false if a String object does or does not end or start with the specified argument

Character.replace("x", "forThis")         //allows you to replace all occurrences of some character within a String.

x = Integer/Double/etc.toString()        //convert their objects to strings

boolean x = Character.regionMatches(IntStart,secondString,intStart2,IntEnd) //the position at which to start in the calling String, the other String being compared, the 
                                                                            //position to start in the other String, and the length of the comparison



//--------------------------To compare strings use this in the argument of the condition ex: if(here)-------------------------------------

aString.equalsIgnoreCase(String)        //Evaluates taking into consideration the case of the letters
aString.equeals(aString);               //Evaluates regardless of the case of the letters



//--------------------------Declaring strings-------------------------------------

String Fred;            //same as setting it null, the string lacks content so it cant be compared but can be use. similar to int x;
String Fred = "";       //Sets it as empty. It would be equivalent to int x = 0;





//----------------------------------------------------------Example of usage of these methods to get a segment of a string--------------------------------------------------------------------------------

        while (x < name.length()) {
            c = name.charAt(x);
            if (c == ' ') {
                firstName = name.substring(0, x);
                familyName = name.substring(x + 1, name.length());
                x = name.length();
            }