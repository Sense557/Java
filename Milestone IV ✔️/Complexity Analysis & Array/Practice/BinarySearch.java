import java.util.*;

// import java.util.*;

/**
 *  Binary Search
 */

// Time Complexity: O(logn to the base 2)
// Space Complexity: O(1)

public class BinarySearch {

    static int binarySearch(int arr[], int x)
    {
        int low = 0;
        int high = arr.length-1;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[mid] < x)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr [] = {2,4,6,8,10,12};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to searxh in the array");
        int x = sc.nextInt();

        int result = binarySearch(arr, x);

        System.out.println("The index of the x is: " +result);

        sc.close();
    }
    
}
