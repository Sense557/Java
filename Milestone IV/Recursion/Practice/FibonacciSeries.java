public class FibonacciSeries {

    public static int fibonacciSeriesFind(int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }
        else
        {
            return fibonacciSeriesFind(n-1) + fibonacciSeriesFind(n-2);
        }
    }
    public static void main(String[] args) {

        int n = 4;

        int result = fibonacciSeriesFind(n);

        System.out.println(result);

        
    }
}
