// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package partb3;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class TaxImpl extends UnicastRemoteObject implements Tax {

    public TaxImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateTax(double income) throws RemoteException {
        double tax = 0;

        if (income <= 300000) {
            tax = 0;
        } else if (income <= 600000) {
            tax = (income - 300000) * 0.05;
        } else if (income <= 900000) {
            tax = (300000 * 0.05) + (income - 600000) * 0.10;
        } else if (income <= 1200000) {
            tax = (300000 * 0.05) + (300000 * 0.10) + (income - 900000) * 0.15;
        } else if (income <= 1500000) {
            tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (income - 1200000) * 0.20;
        } else {
            tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (300000 * 0.20) + (income - 1500000) * 0.30;
        }

        return tax;
    }
}
