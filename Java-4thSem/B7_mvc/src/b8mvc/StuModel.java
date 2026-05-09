// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package b8mvc;
public class StuModel {
    private String rollno, name;
    private int m1, m2, m3;

    public StuModel(String rollno, String name, int m1, int m2, int m3) {
        this.rollno = rollno;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    
    public int getM1() {
        return m1;
    }
    
    public void setM1(int m1) {
        this.m1 = m1;
    }
    
    public int getM2() {
        return m2;
    }
    
    public void setM2(int m2) {
        this.m2 = m2;
    }
    
    public int getM3() {
        return m3;
    }
    
    public void setM3(int m3) {
        this.m3 = m3;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRollNo() {
        return rollno;
    }
    
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    
    public String getResult() {
        String result = "";
        if (m1<35 || m2<35 || m3<35) {
            result = "Fail";
        } else {
            double per = ((m1 + m2 + m3) / 3);
            if (per >= 75) {
                result = "Distinction";
            }
            else if (per >= 60) {
                result = "First Class";
            }
            else if (per >= 50) {
                result = "Second Class";
            }
            else if (per >= 35) {
                result = "Third Class";
            }
            else {
                result = "Fail";
            }
        }
        return result;
    }
    
    public String getGrade() {
        double per = ((m1 + m2 + m3) / 3);
        String grade = "";
        if (per >= 90) {
            grade = "A";
        }
        else if (per >= 80) {
            grade = "B";
        }
        else if (per >= 70) {
            grade = "C";
        }
        else if (per >= 35) {
            grade = "D";
        }
        else {
            grade = "E";
        }
        
        return grade;
    }
}
