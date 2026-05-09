// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package b1jdbc;

import java.sql.*;
import java.util.Scanner;


public class B1JDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
//            DriverManager.getConnection(ConnectionString, Username, Password);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdbjava", "root", "");
            Statement stmt = con.createStatement();
            int choice;
            do {
                System.out.print("\n---------MENU DRIVEN---------\n1)Add Student\n2)Delete Student\n3)Update Student\n4)Search Student\n5)Exit\nEnter your choice: ");
                choice = sc.nextInt();
                
                switch(choice) {
                    case 1: 
                        System.out.print("Enter RegNo: ");
                        int reg = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter DOB: ");
                        String dob = sc.nextLine();

                        System.out.print("Enter address: ");
                        String addr = sc.nextLine();

                        System.out.print("Enter Class: ");
                        String cls = sc.nextLine();

                        System.out.print("Enter course: ");
                        String course = sc.nextLine();
                        
                        String insert = String.format("INSERT INTO student VALUES(%d, '%s', '%s', '%s', '%s', '%s')", reg, name, dob, addr, cls, course);
//                        String insert = "INSERT INTO student VALUES(" + reg + "" name, dob, addr, cls, course;
                        stmt.executeUpdate(insert);
                        
                        System.out.println("Student Added!");
                        break;
                    case 2:
                        System.out.print("Enter regno to delete: ");
                        int dreg = sc.nextInt();
                        String del = "DELETE FROM student WHERE Regno = " + dreg;
                        stmt.executeUpdate(del);
                        
                        System.out.println("Student Deleted!");
                        break;
                    case 3:
                        System.out.print("Enter regno to update addr: ");
                        int ureg = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Enter new address: ");
                        String newAdd = sc.nextLine();
                        
                        String upd = String.format("UPDATE student SET Address = '%s' WHERE Regno = %d",newAdd, ureg);
                        stmt.executeUpdate(upd);
                        
                        System.out.println("Update successful!!");
                        break;
                    case 4:
                        System.out.print("Enter regno to display: ");
                        int sreg = sc.nextInt();
                        
                        String search = "SELECT * FROM student WHERE Regno = " + sreg;
                        ResultSet rs = stmt.executeQuery(search);
                        
                        if (rs.next()) {
                            System.out.println("RegNO: " + rs.getInt(1) + "\nName: "  + rs.getString(2) + "\nDOB: " + rs.getDate(3) + "\nAddress: " + rs.getString(4) + "\nClass: " + rs.getString(5) + "\nCourse: " + rs.getString(6));
                        } else {
                            System.out.println("Student NOT FOUND!");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...............");
                        break;
                    default:
                        System.out.println("INVLAID CHOICE!!");
                }
            } while (choice != 5);
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
