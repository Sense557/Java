public class Countways {

    public static int stairCase(int n)
    {
        if( n <= 1)
        {
            return n;
        }
        else
        {
            return stairCase(n-1)+stairCase(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int result  = stairCase(n+1);

        System.out.println(result);
    }
}
