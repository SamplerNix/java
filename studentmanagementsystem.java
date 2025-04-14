import studentoperation.result;
import java.util.Scanner;
import Studentdata.student;
public class studentmanagementsystem {
   static Scanner cb= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Your name:");
        String name= cb.nextLine();
        System.out.println("Enter Your Rollno:");
        int rollno=cb.nextInt();
        System.out.println("Enter Your Marks:");
        int marks=cb.nextInt();
        student.display(name, rollno,marks);
        result.claculateGrade(marks);
    }
}
