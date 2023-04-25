// import java.util.Scanner;

// /**
//  *  Lower Bound 
//  */



// public class LowerBound 
// {

//     public static int findFirstOccurrence(int arr [], int x)
//     {
//         int result = -1;
//         int low = 0, high = arr.length - 1;

//         while (low <= high)
//         {   
//             //to avoid overflow
//             int mid = low + (high-low)/2;

//             if(arr[mid] == x)
//             {
//                 result = mid;
//                 high = mid - 1;
//             }
//             else if(arr[mid] < x)
//             {
//                 low = mid + 1;
//             }
//             else
//             {
//                 high = mid -1;
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) 
//     {
//         //user input for the size of the array
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int n = sc.nextInt();

//         //user input for the elements
//         System.out.println("Enter the elements of the array");
//         int arr [] = new int [n];

//         for(int i=0; i<n; i++)
//         {
//             arr [i] = sc.nextInt();
//         }

//         //user input for the target element
//         System.out.println("Enter the target element");
//         int x = sc.nextInt();

//         //function calling
//         int result = findFirstOccurrence(arr, x);
        
//         if(result == -1)
//         {
//             System.out.println("Not found");
//         }
//         else
//         {
//             System.out.println("found first occur at index: "+result);
//         }
//     }
// }
