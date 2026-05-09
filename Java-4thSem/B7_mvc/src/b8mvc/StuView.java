 
package b8mvc;
public class StuView {  
    public void displayResult(String Rno, String Sname, int m1, int m2, int m3, String result, String grade) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Roll No Name\tMarks1  Marks2  Marks3  Result\t Grade");
        System.out.println(Rno + "\t" + Sname + "\t" + m1 + "\t" + m2 + "\t" + m3 + "\t" + result + "\t " + grade);
        System.out.println("-----------------------------------------------------");
    }
}
