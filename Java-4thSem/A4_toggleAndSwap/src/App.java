// Write a java program to find words with even number of characters in a string, then swap the 
// pair of characters in those words and also toggle the characters in a given string  
//     EX: Good Morning everyone  
//     Output: oGdo vereoyen  
//             gOOD mORNING EVERYONE

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        /**
         * STRING SPLITTING: The .split(" ") method breaks a single String into 
         * an array of Strings (tokens) using the space character as a delimiter.
         */
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];

            // Logic: Only process words with an even number of characters.
            if(word.length()%2 == 0) {
                
                /**
                 * ARRAY CONVERSION: Strings are immutable in Java. To swap characters 
                 * in-place, we convert the String to a mutable char array.
                 */
                char[] chars = word.toCharArray();

                /**
                 * SWAP LOGIC: Iterates through the array in steps of 2 (j+=2).
                 * Uses a 'temp' variable to swap the current character with its neighbor.
                 */
                for(int j = 0; j < chars.length; j+=2) {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }

                // Converting the modified character array back into a String object.
                String processedWord = new String(chars);
                result.append(processedWord);
            }

            // Logic: Re-adds spaces between words, except after the very last word.
            if(i < words.length - 1)
                result.append(" ");
        }
        
        /**
         * WRAPPER CLASS METHODS: Character.isUpperCase() and Character.toLowerCase()
         * are static methods that check/transform individual character properties.
         */
        StringBuilder sb = new StringBuilder();
        for(char c: input.toCharArray()){
            if(Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c)); // Toggles 'A' to 'a'
            else if(Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c)); // Toggles 'a' to 'A'
            else
                sb.append(c);// Keeps symbols/numbers as they are
        }

        /**
         * PRINT LOGIC: Displays both the rearranged 'even-length' word string 
         * and the full 'case-toggled' version of the original input.
         */
        System.out.println("Transformed String: " + result + "\nToggled: " + sb.toString());
        sc.close();
    }
}

//              OUTPUT
// Enter a string: Good Morning everyone
// Transformed String: oGdo  vereoyen
// Toggled: gOOD mORNING EVERYONE  