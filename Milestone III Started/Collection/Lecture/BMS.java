import java.util.Scanner;

/**
 *  Banking Management App
 */


public class BMS 
{
    public static Scanner sc = new Scanner(System.in);
    private static int balance = 0;
    public static void main(String[] args) 
    {
        boolean flag = false;
        while(!flag)
        {
            System.out.println("Enter your choice");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1: deposit();
                break;
                case 2: withdraw();
                break;
                case 3: checkBalance();
                break; 
                case 4: System.exit(0);
                break;
                default: System.out.println("Invalid choice!");
                break;
            }
        }
    }
    private static void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deposit amount");
        int amount = sc.nextInt();

        if(amount>0)
        {
            balance += amount;
            System.out.println("Deposit successful!");
        }
        else
        {
            System.out.println("Invalid amount");
        }
        
    }
    private static void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount");
        int amount = sc.nextInt();

        if(amount >0)
        {
            if(balance>=amount)
            {
                balance -= amount;
                System.out.println("Withdraw successful!");
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
    private static void checkBalance()
    {
        System.out.println("Your balance is: "+balance);
    }
}
