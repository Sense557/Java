public class Factorial {

    public static int factorialFinding(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else 
        {
            return n * factorialFinding(n-1);
        }
    }

    public static void main(String[] args) {
        
        int n = 3;

        int result = factorialFinding(n);

        System.out.println(result);
    }
}
