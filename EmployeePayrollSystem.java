import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        String EmpName = vc.nextLine();
        int empID = vc.nextInt();
        int salary = vc.nextInt();
        try {
            if (salary < 0) {
                throw new Exception("Invalid salary");
            }
            System.out.println(EmpName);
            System.out.println(empID);
            System.out.println(salary);
        } catch (Exception e) {
            System.out.println("Salary can't be in negative");
        }
        finally {
            System.out.println("Execution is complete");
        }
    }
}
