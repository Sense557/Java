public class FibSeriesBottomUp {
    public static int fibHelper (int n, int[] fibseries){
        //base case
        if(n == 0 || n == 1){
            return n;
        }
        if(fibseries [n] != -1){
            return fibseries[n];
        }
        int x = fibHelper (n-1, fibseries);
        int y = fibHelper(n-2, fibseries);

        fibseries[n] = x+y;

        //return final output
        return fibseries[n];
    }
    public static int fib(int n){
        int fibseries [] = new int [n+1];
        //initialize to -1
        for(int i = 0; i<=n; i++){
            fibseries [i] = -1;
        }
        return fibHelper(n, fibseries);
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println();
        System.out.println("fibseries for n= " + n + " is: "+ fib(n));
    }
}
