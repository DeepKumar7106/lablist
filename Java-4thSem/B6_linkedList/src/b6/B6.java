// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package b6;

import java.util.*;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        while (true) {
           System.out.print("\nMENU DRIVEN PROGRAM \n 1)to Insert some elements in a linked list \n 2)Swap two elements in linked list\n 3)to iterate a linked list in reverse order\n 4)to compare two linked list \n 5)to convert a linked list into Arraylist\n 6)Exit \nEnter your choice: ");
           int choice = sc.nextInt();
           switch(choice) {
               case 1:
                   System.out.print("Enter the element to insert: ");
                   String val = sc.next();
                   System.out.print("Enter the position (0 to " + list.size() + "): ");
                   int pos = sc.nextInt();
                   if(pos >= 0 && pos <=list.size()) {
                       list.add(pos, val);
                       System.out.println("Updated list" + list);
                   }
                   else 
                       System.out.println("Invalid position");   
                   break;
               case 2: 
                   System.out.print("Enter first index to swap: ");
                   int idx1 = sc.nextInt();
                   System.out.print("Enter second index to swap: ");
                   int idx2 = sc.nextInt();
                   if(idx1 < list.size() && idx2 < list.size()) {
                       Collections.swap(list, idx1, idx2);
                       System.out.println("After Swap: " + list);
                   }
                   else    
                       System.out.println("Indices out of bound");   
                   break;
               case 3: 
                   System.out.println("Reversed Iteration: ");
                   Iterator<String> revIt = list.descendingIterator();
                   while(revIt.hasNext()){
                       System.out.print(revIt.next() + " ");
                   }
                   System.out.println();
                   break;
               case 4: 
                   LinkedList<String> newList = new LinkedList<String>();  //(Arrays.asList("10","20","30"));
                   System.out.println("Enter the elements for Second List: ");
                   String value = "";
                   int index = 0;
                   while(true) {
                       value = sc.nextLine();
                       if(value.equals("stop")) 
                           break;
                       newList.add(index++, value);                   
                   }
                   System.out.println("Comparing two link lists... " + newList + " " + list + " list");
                   if(list.equals(newList))
                       System.out.println("Both lists are equal!!");
                   else
                       System.out.println("Both lists are not equal!!");
                   break;
               case 5: 
                   ArrayList<String> arrayList = new ArrayList<String>(list);
                   System.out.println("Converted Array list: " + arrayList);
                   break;
               case 6: 
                   System.out.println("Exiting..........");
                   System.exit(0);
               default:
                   System.out.println("Invalid choice... Try Again...");
           }
        }
    }
}
