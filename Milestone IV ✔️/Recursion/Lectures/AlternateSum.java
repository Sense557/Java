import java.util.Scanner;

public class AlternateSum { 
    public static int sum(int n) {
        
            //base case condition 
            if(n == 0) {
                return 0;
            }
            //recursive function call
            if(n%2 == 0) {
                return sum(n-1)-n;
            }
            //if odd
            else{
                return sum(n-1) + n;
            }
        }

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        num = sc.nextInt();

        //Function Calling
        int result = sum(num);
        System.out.println(result);
    }
}
