import java.util.Scanner;

class Bankaccount{
   static Scanner cb=new Scanner(System.in);
    public static int Acc_num;
    public static String Acc_Name;
    public static int Balance=12000;
    public static void  deposit(int amount){
        System.out.print("Enter Your Account number :");
        Acc_num=cb.nextInt();
        cb.nextLine();
        System.out.print("Your Name :");
        Acc_Name=cb.nextLine();
        System.out.println("Your Account number is :"+Acc_num);
        System.out.println("Account holder name is:"+Acc_num);
        System.out.println("Your Previous balance is :"+Balance);
        Balance+=amount;
        System.out.println("Your Current Balance is :"+Balance);
    }
    public void withdraw(int amount){
        System.out.print("Enter Your Account number :");
        Acc_num=cb.nextInt();
        cb.nextLine();
        System.out.print("Your Name :");
        Acc_Name=cb.nextLine();
        System.out.println("Your Account number is :"+Acc_num);
        System.out.println("Account holder name is:"+Acc_num);
        System.out.println("Your Previous balance is :"+Balance);
            Balance-=amount;
            System.out.println("Your Current balance is: "+Balance);
    }
    class SavingAccount extends Bankaccount{
        @Override
        public void withdraw(int amount){
            if(Balance<=1000){
                System.out.println("You can't with draw money, Insuficient Balance,Your Balance is: "+Balance);
            }
            else{
                Balance-=amount;
                System.out.println("Your Current balance is: "+Balance);
            }
        }
    }

}
public class Bankingsystem {
    static Scanner cb = new Scanner(System.in);

    public static void main(String[] args) {
        Bankaccount obj = new Bankaccount();
        System.out.println("1.To Depposit a amount");
        System.out.println("2.To Withdraw an amount");
        System.out.println("Exit");
        while (true) {
            System.out.println("Enter Your Choice");
            int choice = cb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount that you want to deposit");
                    int amount = cb.nextInt();
                    obj.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount that you want to withdraw");
                    int amounts = cb.nextInt();
                    obj.withdraw(amounts);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
