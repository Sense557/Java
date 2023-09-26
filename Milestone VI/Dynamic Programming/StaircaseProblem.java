public class StaircaseProblem {
    public static int countWays (int n) 
    {
        int prev1 = 1, prev2 = 1, current;
        for(int i = 2; i<=n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println("for n = 1, total no. of ways: "+countWays(1));
        System.out.println("for n = 2, total no. of ways: "+countWays(2));
        System.out.println("for n = 3, total no. of ways: "+countWays(3));
        System.out.println("for n = 4, total no. of ways: "+countWays(4));
    }
}
