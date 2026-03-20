// Find the second maximum and second minimum in a set of numbers using auto boxing and 
// unboxing.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        if(n < 2) {
            System.out.println("Need atleast 2 numbers");
            sc.close();
            return;
        }
        /**
         * TREESET: A collection that stores unique elements in ascending order.
         * Concept: It automatically handles sorting and removes any duplicates 
         * entered by the user, which is vital for finding the *distinct* second min/max.
         */
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++ ) {
            set.add(sc.nextInt());
        }

        // Logic check: If user entered duplicates (e.g., 5, 5, 5), the set size 
        // will shrink, potentially leaving no "second" unique value.
        if(set.size() < 2) {
            System.out.println("No second min or second max");
            sc.close();
            return;
        }

        /**
         * ARRAYLIST CONVERSION: TreeSets do not support index-based access (like .get(i)).
         * By passing the set into the ArrayList constructor, we create an indexed 
         * list that preserves the sorted order of the TreeSet.
         */
        ArrayList<Integer> list = new ArrayList<>(set);
        
        /**
         * LOGIC: 
         * list.get(1) retrieves the second element (index 1) which is the second minimum.
         * list.get(list.size() - 2) retrieves the second-to-last element, the second maximum.
         */
        System.out.print("Second minimum: " + list.get(1) + "\nSecond maximum: " + list.get(list.size() - 2));
        sc.close();
    }
}

//          OUTPUT
// Enter how many numbers: 6
// Enter the numbers: 
// 10
// 3
// 29
// 46
// 3
// 4
// Second minimum: 4 
// Second maximum: 29