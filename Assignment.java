import java.util.Scanner;

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
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                if (n % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("odd");
                }
                break;
            case 2:
                int result = factorial(n);
                System.out.println(result);
                break;
        }
    }
}

class Assignment {

    public static void main(String[] args) {
        //  System.out.println("Hello worlds"); 
        questioon6.isPrime(9);
        question7.factorial(5);
        question7.oddeve(5);
    }
}
