public class SubsetSumProblem {
    public static boolean isSubsetSum (int [] arr, int n, int sum){
        boolean subSet [][] = new boolean [sum+1] [n+1];
        
        //if sum is zero then return true
        for(int i = 0; i<=n; i++){
            subSet [0][i] = true;
        }

        //if sum is not 0 and set is empty then return false
        for(int i = 1; i<=sum; i++){
            subSet [i][0] = false;
        }

        for(int i = 1; i<=sum; i++){
            for(int j = 1; j<=n; j++){
                subSet [i][j] = subSet [i][j-1];
                if(i >= arr [j-1])
                {
                    subSet [i][j] = subSet [i][j] || subSet [i - arr[j-1]][j-1];
                }

            }
        }
        return subSet [sum][n];
    }
    public static void main(String[] args) {
        int [] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        if(isSubsetSum(arr, arr.length, sum))
        {
            System.out.println("subset found");
        }else{
            System.out.println("subset not found");
        }
    }
}
