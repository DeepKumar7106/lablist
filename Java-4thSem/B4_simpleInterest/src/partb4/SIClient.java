
// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package partb4;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.LocateRegistry.*;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class SIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry(18888);
        ISimpleInterest si = (ISimpleInterest) reg.lookup("Simple Interest");
        
        Scanner sc = new Scanner(System.in);
        double p,t,r;
        String ans = "n";
        do {
            System.out.println("Simple Interest Calculation...");
            System.out.print("Principle: ");
            p = sc.nextDouble();
            System.out.print("Time: ");
            t = sc.nextDouble();
            System.out.print("Rate: ");
            r = sc.nextDouble();
            System.out.println("Simple Interest is: " + si.ComputeInterest(p, t, r));
            System.out.println("Do you want to continue [y/n]?");
            sc.nextLine();
            ans = sc.nextLine();
        } while(ans.toLowerCase().charAt(0) == 'y');
    }
}
