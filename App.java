import java.util.Scanner;
class question3 {
    public static void swap(int a, int b){
        System.out.println("before swapping a,b:"+a+" "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping a and b:"+a+","+b);
    }
}
class question4{
    Scanner sv =new Scanner(System.in);
    public void arr(){
        System.out.print("Enter the Size of an array :");
    int size= sv.nextInt();
    int [] arr =new int[size];
    System.out.println("Enter the elements in an array :");
    for(int i=0;i<size;i++){
        arr[i]=sv.nextInt();
    }
    int maxnum=0;
    int min=-1;
    for(int i=0;i<size;i++){
        if(arr[i]>maxnum){
            maxnum=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Maximum nuber :"+maxnum);
     System.out.println("Minimum number:"+min);
}
}
class question5{
    public static void arthematic(int a,int b){
System.out.println("Addition:"+(a+b));
System.out.println("Subtraction:"+(a-b));
System.out.println("Division:"+(a/b));
System.out.println("Multiplication:"+(a*b));
System.out.println("Modulous:"+(a%b));
    }
}
public class App {
    public static void main(String[] args) throws Exception {
       // Question 1;
        System.out.println("Hello, World!");
        String javaversion=System.getProperty("java.version");
        System.out.println(javaversion);
        //question 3
        question3.swap(3,5);
        //question 4
        question4 obj =new question4();
        obj.arr();
        //question5
        question5.arthematic(10,7);
    }
}
