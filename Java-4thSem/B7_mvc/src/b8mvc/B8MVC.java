// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package b8mvc;

import java.util.Scanner;

public class B8MVC {

    public static void main(String[] args) {
        String RNo, Sname;
        int m1, m2, m3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Roll No.: ");
        RNo = in.nextLine();
        System.out.print("Enter the Name: ");
        Sname = in.nextLine();
        System.out.println("Enter the marks in three subjects");
        m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();
    
        StuModel sm = new StuModel(RNo, Sname, m1, m2, m3);
        StuView sv = new StuView();
        StuController sc = new StuController(sm, sv);
        sc.UpdateView();
    }
}
