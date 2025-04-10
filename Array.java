import java.util.Arrays;
import java.util.Scanner;
public class Array {
    static Scanner cv=new Scanner(System.in);
    public static void Array(int n) {
        System.out.println("Enter the size of an Array");
        int[] arr = new int[n];
        System.out.println("Enter the n elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = cv.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Vlues at " + i + " is " + arr[i]);
        }
    }
    public static void operation(int n){
        n=cv.nextInt();
    }
    }