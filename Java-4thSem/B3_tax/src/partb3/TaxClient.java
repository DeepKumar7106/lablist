// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package partb3;

import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class TaxClient {
    public static void main(String[] args)throws RemoteException, NotBoundException {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 18888);
            Tax taxService = (Tax) registry.lookup("TaxService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your annual income: ");
            double income = scanner.nextDouble();
            scanner.close();

            double tax = taxService.calculateTax(income);
            System.out.println("Your calculated income tax is: " + tax);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
