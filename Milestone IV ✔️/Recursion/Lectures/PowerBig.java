import java.math.BigInteger;
import java.util.Scanner;

public class PowerBig{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a & b");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();

        //function calling
        BigInteger result = powerFind(a,b);
        System.out.println("power of an element is: "+result);
    }

    private static BigInteger powerFind (BigInteger a, int b) {
        BigInteger result, finalResult;

        //Base Case Condition
        if(b == 1){
            return a;
        }else {
            result = powerFind(a, b/2);
            finalResult = result.multiply(result);

            if(b%2 == 0){
                return finalResult;
            }else{
                return a.multiply(finalResult);
            }
        }
    }
}
