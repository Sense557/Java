import java.util.*;

/**
 *  Factorial
 *      - Find the factorial of 5 ?
 *      5! = 5*4*3*2*1 = 120 
 * 
 *      Limitation of this code is limited to 16 factorial 
 *          How to fix it?
 */



// function to find factorial of a number
public class Factorial 
{
    public static int fact (int n)
        {
            // base case
            if(n<1)
            {
                return 1;
            }
            // recursive call
            else
                return n*fact(n-1);
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+ fact(n));

        sc.close();
        
    }
}


