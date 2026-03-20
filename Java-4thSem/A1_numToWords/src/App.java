// 1. Write a program to convert numbers into words using Enumerations with constructors, methods 
// and instance variables.(INPUT RANGE-0 TO 99999)  
// EX: 36 THIRTY SIX 

//importing scanner from the util package
import java.util.Scanner;

/**
 * ENUMS: Used here to define a fixed set of constants representing number words.
 * This approach encapsulates both the numeric value and its string representation (name).
 */
enum Ones {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11), TWELVE(12), THIRTEEN(13), FORTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19);
    
    private int value;
    // Enum Constructor: Assigns the integer value to each constant during initialization.
    Ones(int value) {this.value = value;}

    /**
     * STATIC METHOD: Iterates through the enum values to find a match for the input number.
     * name() is a built-in enum method that returns the constant's name as a String.
     */
    public static String getWord(int num) {
        for(Ones o : Ones.values())
            if(o.value == num) return o.name();
        return " ";
    }
}

enum Tens {
    TWENTY(20), THRITY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70), EIGHTY(80), NINETY(90);
    private int value;
    Tens(int value) {this.value = value;}

    public static String getWord(int num) {
        for(Tens t : Tens.values())
            if(t.value == num) return t.name();
        return " ";
    }
}

public class App {
    /**
     * RECURSION: This method calls itself to break down large numbers into 
     * smaller components (e.g., breaking 12,345 into '12' thousand and '345').
     */
    public static String convert(int num) {
        // STRINGBUILDER: A mutable sequence of characters, more memory-efficient 
        // than standard String concatenation in loops or recursive calls.
        StringBuilder s = new StringBuilder();
        if(num < 20) 
            s.append(Ones.getWord(num));
        else if(num < 100) {
            // Logic: Isolates the tens digit (num/10 * 10) and adds the remainder if it exists.
            s.append(Tens.getWord((num/10) * 10));
            if(num%10 != 0 ) 
                s.append(" ").append(Ones.getWord(num%10));
        } 
        else if(num < 1000) {
            // Logic: Gets the hundreds digit word and recursively processes the last two digits.
            s.append(Ones.getWord(num/100)).append(" HUNDRED");
            if(num%100 != 0)
                s.append(" ").append(convert(num%100));
        } 
        else if(num <= 99999) {
            // Logic: Treats the first two digits as a single unit (thousands) and processes the rest.
            s.append(convert(num/1000)).append(" THOUSAND");
            if(num%1000 != 0) 
                s.append(" ").append(convert(num%1000));
        }

        return s.toString();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0  and 99,999: ");
        int n = sc.nextInt();
        if(n >= 0 && n <= 99999) {
            StringBuilder result = new StringBuilder();
            /**
             * LOGIC: Builds the final output by appending the integer 'n' 
             * and the result of the 'convert' method which contains the word logic.
             */
            result.append(n).append(":").append(convert(n));
            System.out.println(result);
        }
        else
            System.out.println("Out of range!!");
        sc.close();
    }
}


//                 output
// Enter a number between 0  and 99,999: 23789
// 23789:TWENTY THREE THOUSAND SEVEN HUNDRED EIGHTY NINE