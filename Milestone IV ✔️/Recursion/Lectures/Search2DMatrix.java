// Q. 74 Leetcode

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m*n-1;
        while(low <= high)
        {
            int midIdx = low + (high-low) / 2;
            int rowIdx = midIdx / n;
            int colIdx = midIdx % n;
            int midElem = matrix[rowIdx][colIdx];

            if(midElem == target)
            {
                return true;
            }
            if(midElem < target)
            {
                low = midIdx + 1;
            }
            else
            {
                high = midIdx -1;
            }
        }
        return false;
    }
}
