import java.util.Arrays;
import java.util.Scanner;
class Array1 {
   public static int [] arr;
   public static int n;
   public static int count=0;
    static Scanner cv = new Scanner(System.in);
    public static void array(){
        System.out.println("enter the size of an array");
        n=cv.nextInt();
     arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Entering a data at"+i+"Indexing");
            arr[i]=cv.nextInt();
            count++;
        }
    }
    public static void view(){
        for(int i=0;i<arr.length;i++){
            System.out.println("at index"+i+":"+arr[i]);
        }
    }
    public static void add(){
        System.out.println("ENTER THE INDEX WHERE YOU WANT TO ADD THE ELEMENT AT:");
        int value=cv.nextInt();
        System.out.println("ente the value at"+value);
        arr[value]=cv.nextInt();
        count++;
    }
    public static void remove(){
        System.out.println("Enter the index from where you want to remove an Element:");
        int index=cv.nextInt();
        arr[index]=0;
        count--;
    }
    public static int[] doublearray(int [] ar){
       int new_size=ar.length*2;
       int [] new_array=new int[new_size];
       for(int i=0;i<ar.length;i++){
           new_array[i]=ar[i];
       }
        return new_array;
    }
    public static void check(){
    for(int i=0;i<arr.length;i++){
        if(count==arr.length){
        arr=doublearray(arr);
        }
    }
        System.out.println("Size is being doubled!");
    }
}

class Array {
    public static void main(String[] args) {
        Array1 obj = new Array1();
        Scanner sb = new Scanner(System.in);
        System.out.println("1. Give size of an array and Enter the value till Size.");
        System.out.println("2.View");
        System.out.println("3 dynamically change the size by doubling it .");
        System.out.println("4.Add value by indexing");
        System.out.println("5.Remove a with indexing");
        System.out.println("6.Exit");
        while(true){
        System.out.println("Enter your Choice:");
        int choice = sb.nextInt();
        switch (choice) {
            case 1:
                obj.array();
                break;
            case 2:
                obj.view();
                break;
            case 3:
                obj.check();
               break;
            case 4:
                obj.add();
                break;
            case 5:
                obj.remove();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("U entered the wrong choice:");
        }
    }}
}