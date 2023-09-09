import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 8, 10, 12, };
        System.out.println("Enter the target value");
        int target = sc.nextInt();

        // function calling
        int result = binarySearch(arr, 0, arr.length, target);
        System.out.println("The target index is: " + result);
    }

    public static int binarySearch(int arr[], int low, int high, int target) {
        int result = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            
            //condition-1 match
            if(arr[mid] == target){
                return mid;
            }

            //condition-2 match
            if(arr[mid] < target){
                return binarySearch(arr, mid+1, high, target);
            }

            //condition-3 match
            else {
                return binarySearch(arr, low, mid-1, target);
            }
        }
        return result;
    }
}
