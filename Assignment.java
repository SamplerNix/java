import java.util.Scanner;
import mypacakage.calculator;
//question10
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
// Child class that inherits from Animal
class Dog extends Animal {

    // Constructor for Dog
    public Dog(String name) {
        // Calling the parent class (Animal) constructor
        super(name);
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

//question 9
class methodoverloading{
    public static void method(int n){
        System.out.println("Square of number is:"+n*n);
    }
        public static void method(float n){
        System.out.println("This floating number:"+n);
    }
        public static void method(int n,int m){
        System.out.println("These are the two number which are in int form:"+n+","+m);
    }
}
//question 8
class student{
    public static void student(){
    String name="Nikhil";
    int roll_no=78;
    String[] Marks={"Math","English","Science","History"};
    int[] marks={78,86,89,90};
    System.out.println("Name:"+name);
    System.out.println("Rollno:"+roll_no);
    for(int i=0;i<4;i++){
        System.out.println(Marks[i]+":"+marks[i]);
    }
}
}
class questioon6 {

    public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("1");
        }
        for (int i = 2; i < (n / 2); i++) {
            if ((n % i) == 0) {
                System.out.println("Number is not prime and divisible by:" + i + ",");
            }
            // System.out.println("Number is prime");
        }
        // System.out.println("Number is prime");
    }
}

class question7 {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static Scanner sc = new Scanner(System.in);

    public static void oddeve(int n) {
        System.out.println("Enter your choice:1->odd or even;2-> Factorial:");
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the value of N:");
                    n = sc.nextInt();
                    if (n % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("odd");
                    }
                    break;
                case 2:
                    System.out.println("enter the value of N:");
                    n = sc.nextInt();
                    int result = factorial(n);
                    System.out.println(result);
                    break;
                default:
                    System.out.println("You entered the wrong value");
                    break;
            }
        }
    }

class Assignment {

    public static void main(String[] args) {
         System.out.println("Hello worlds");
        Scanner sc=new Scanner(System.in);
        questioon6.isPrime(9);
        question7.factorial(5);
        question7.oddeve(5);
        // //question 8
        student.student();
        //question 9//This is method overloading , use , int and (int,int)
        methodoverloading.method((float)2.3);
        //question10
//        Dog p=new Dog("hello");
//        p.eat();
//        p.sleep();
//        p.bark();
        System.out.println("Enter the value use calculator:");
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        calculator.add(a,b);
        calculator.sub(a,b);
        calculator.divide(a,b);
        calculator.modulous(a,b);
        Array.Array(5);
    }
}
