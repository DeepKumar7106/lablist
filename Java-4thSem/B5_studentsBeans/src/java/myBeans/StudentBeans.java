// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myBeans;

/**
 *
 * @author PRO
 */
public class StudentBeans {
  private String name;
  private int age;
  private String course;
  public int getAge(){
      return age;
  }
  public void setAge(int age){
      this.age=age;
      
  }
  public String getCourse(){
      return course;
  }
   public void setCourse(String course){
      this.course=course;
      
  }
  public String getName(){
      return name;
  }
   public void setName(String name){
      this.name=name;
      
  }
}
