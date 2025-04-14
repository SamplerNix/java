package studentoperation;

public class result {
    public static void claculateGrade(int marks){
        if(marks>=90) {
            System.out.println("A");
        } else if (marks>=80) {
            System.out.println("B");
        } else if (marks>=70) {
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}
