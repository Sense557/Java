import java.util.Scanner;

public class SumOfDigits {
    public static int sumDigit (int num) {
        if(num == 0)
            return 0;
        else
            return num%10 + sumDigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The sum of digit is "+sumDigit(n));
    }
}
