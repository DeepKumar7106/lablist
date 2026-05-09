// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package b8mvc;
public class StuController {
    private StuModel model;
    private StuView view;
    
    public StuController(StuModel model, StuView view) {
        this.model = model;
        this.view = view;
    }
    
    public void UpdateView() {
        view.displayResult(model.getRollNo(), model.getName(), model.getM1(), model.getM2(), model.getM3(), model.getResult(), model.getGrade());
    }
}
