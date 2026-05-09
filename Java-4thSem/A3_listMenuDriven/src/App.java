// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).


// Write a menu driven program to create an Arraylist and perform the following operations 
//      i) Adding elements 
//      ii) Sorting elements  
//      iii) Replace an element with another  
//      iv) Removing an element 
//      v) Displaying all the elements  
//      vi) Adding an element between two elements


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // ARRAYLIST: A dynamic array that can grow or shrink in size.
        // It is part of the Java Collections Framework.
        ArrayList<Integer> list  = new ArrayList<>();

        // BOOLEAN FLAG: Used to control the lifecycle of the menu loop.
        boolean loop = true;
        while (loop) {
            //Long-ahh print statement printing all menu options
            System.out.print("\n\n----MENU DIRVEN----\n-1) Adding elements \r\n-2) Sorting elements  \r\n-3) Replace an element with another  \r\n-4) Removing an element \r\n-5) Displaying all the elements  \r\n-6) Adding an element between two elements\n -7) Exit\n\nEnter the choice: ");

            // SWITCH-CASE: An efficient way to handle multiple conditional branches 
            // based on the value of a single variable (choice)
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be added: ");
                    // .add(value): Appends the element to the end of the list.
                    list.add(sc.nextInt());
                    break;
                case 2: 
                    // COLLECTIONS.SORT(): A static utility method that sorts the 
                    // list in ascending order (Uses Dual-Pivot Quicksort/TimSort).
                    Collections.sort(list);
                    System.out.println("Sorted!!...");
                    break;
                case 3:
                    System.out.print("Enter the index of the value to be replaced: ");
                    int i = sc.nextInt();
                    System.out.print("Enter the value to be replaced: ");
                    int value = sc.nextInt();
                    
                    // .set(index, value): Replaces the element at the specified 
                    // position. Requires index validation to avoid IndexOutOfBoundsException.
                    if(i >= 0 && i < list.size()) {
                        list.set(i, value);
                        System.out.println("Value Replaced");
                    } else
                        System.out.println("Invalid Index..  ");
                    break;
                case 4:
                    System.out.println("Enter the value to remove: ");
                    int val = sc.nextInt();
                    
                    /**
                     * BOXING: Integer.valueOf(val) ensures we are removing the 
                     * OBJECT (value) rather than the element at a specific INDEX.
                     * Returns true if the element was found and removed.
                     */
                    //Java has two way of removing an element
                    // list.remove(int index) removes using its index
                    // list.remove(Obejct o) removes the matching value 
                    // Integer.valueOf(val) returns an object which is passed as arg to remove function to remove the said value
                    if(list.remove(Integer.valueOf(val)))
                        System.out.println(val + " removed!");
                    else
                        System.out.println("Invalid Value");
                    break;
                case 5: 
                    // printing the list(array)
                    System.out.println("Array elements: " + list);
                    break;
                case 6: 
                    System.out.print("Enter the value to add: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter the position of the element: ");
                    int pos = sc.nextInt();
                    
                    // OVERLOADED ADD: .add(index, value) inserts the element and 
                    // shifts all subsequent elements to the right.
                    if(pos >= 0 && pos < list.size()) {
                        list.add(pos,ele);
                        System.out.println("Value added");
                    } else
                        System.out.println("Invalid Index..  ");
                    break;
                case 7:
                    // Setting the flag to false to break the while loop.
                    System.out.println("Exiting......     ");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice... ");
                    break;
            }
        }
        sc.close();
    }
}

//          OUTPUT

// ----MENU DIRVEN----
// -1) Adding elements 
// -2) Sorting elements
// -3) Replace an element with another
// -4) Removing an element
// -5) Displaying all the elements
// -6) Adding an element between two elements
// -7) Exit
// Enter the choice: 1
// Enter the element to be added: 10


// Enter the choice: 1
// Enter the element to be added: 20


// Enter the choice: 1
// Enter the element to be added: 40


// Enter the choice: 5
// Array elements: [10, 20, 40]


// Enter the choice: 6
// Enter the value to add: 2
// Enter the position of the element: 3
// Invalid Index..  


// Enter the choice: 5
// Array elements: [10, 20, 40]


// Enter the choice: 6
// Enter the value to add: 50
// Enter the position of the element: 2
// Value added


// Enter the choice: 5
// Array elements: [10, 20, 50, 40]


// Enter the choice: 3
// Enter the index of the value to be replaced: 1
// Enter the value to be replaced: 30
// Value Replaced


// Enter the choice: 4
// Enter the value to remove: 
// 40
// 40 removed!


// Enter the choice: 2
// Sorted!!...


// Enter the choice: 5
// Array elements: [10, 30, 50]


// Enter the choice: 7
// Exiting...... 
