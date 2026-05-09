// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package b2_l4;

//import java.beans.Statement;
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.util.Scanner;

public class B2_l4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "");
//            Statement stmt = con.createStatement();
            
            int choice; 
            do {
                System.out.print("\n---------MENU DRIVEN---------\n1)Add New Account\n2)Deposit Amount\n3)Withdraw Amount\n4)Display All Records\n5)Exit\nEnter your choice: ");
                choice = sc.nextInt();
                
                switch(choice) {
                    case 1: 
                        System.out.print("Enter Account No: ");
                        int acNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter address: ");
                        String addr = sc.nextLine();

                        System.out.print("Enter Balance: ");
                        double bal = sc.nextDouble();
                        
//                        String insert = String.format("INSERT INTO Bank VALUES(%d, '%s', '%s', %f)", acNo, name, addr, bal);
//                        String insert = "INSERT INTO student VALUES(" + acNo + "" name, dob, addr, cls, course;
//                        stmt.executeUpdate(insert);
                        String insert = "INSERT INTO bank VALUES(?,?,?,?)";
                        PreparedStatement ps = con.prepareStatement(insert);
                        ps.setInt(1,acNo);
                        ps.setString(2, name);
                        ps.setString(3, addr);
                        ps.setDouble(4, bal);
                        
                        ps.executeUpdate();
                        
                        System.out.println("Account Added!");
                        break;
                    case 2:
                        System.out.print("Enter Account number: ");
                        int dacNo = sc.nextInt();
                        
                        String check = "SELECT name FROM bank WHERE ACCNO = ?";
                        PreparedStatement checkStmt = con.prepareStatement(check);
                        
                        checkStmt.setInt(1, dacNo);
                        
                        ResultSet rs = checkStmt.executeQuery();
                        if (!rs.next()) {
                            System.out.println("No account found");
                            continue;
                        }
                        
                        System.out.print("Enter Deposit: ");
                        double dep = sc.nextDouble();
                        
                        String upd = "UPDATE bank SET BALANCE = BALANCE + ? WHERE ACCNO = ?;";
//                        String upd = String.format("UPDATE FROM ")
                        PreparedStatement updStmt = con.prepareStatement(upd);
                        updStmt.setDouble(1, dep); // will eat head or else switch to old way!!
                        updStmt.setInt(2, dacNo);
//                        stmt.executeUpdate(del);
                        
                        int rows = updStmt.executeUpdate();
                        if (rows > 0)
                            System.out.println("Amount Deposited!");
                        else 
                            System.out.println("Account Not Found!");
                        break;
                    case 3:
                        System.out.print("Enter Account No: ");
                        int wacNo = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Enter Withdraw amount: ");
                        double withdraw = sc.nextDouble();
                        
                        String wCheck = "SELECT BALANCE FROM bank WHERE ACCNO = ?";
                        PreparedStatement wCheckStmt = con.prepareStatement(wCheck);
                        
                        wCheckStmt.setInt(1, wacNo);
                        
                        ResultSet wrs = wCheckStmt.executeQuery();
                        if (wrs.next()) {
                            double ubal = wrs.getDouble("BALANCE");
                            if ((ubal - withdraw) > 499) {
                                String update = "UPDATE bank SET BALANCE = BALANCE - ? WHERE ACCNO = ?;";
                                PreparedStatement updateStmt = con.prepareStatement(update);    
                                
                                updateStmt.setDouble(1, withdraw);
                                updateStmt.setDouble(2, wacNo);
                                
                                updateStmt.executeUpdate();
                                System.out.println("Withdrawal Successful!!");
                            } else {
                                System.out.println("Insufficient Balance!!");
                            }
                        } else {
                            System.out.println("AccountNot found!!");
                        }
                        break;
                    case 4:
                        String select = "SELECT * FROM bank";
                        Statement st = con.createStatement();
                        
                        ResultSet rs2 = st.executeQuery(select);
                        
                        System.out.println("\nACCNO\tName\tADDRESS\tBALANCE");
                        while (rs2.next()) {
                            System.out.println(rs2.getInt("ACCNO") + "\t" + rs2.getString("NAME") + "\t" + rs2.getString("ADDRESS") + "\t" + rs2.getDouble("BALANCE"));
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
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
