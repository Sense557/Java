// /**
//  *  Reversal in array
//  */

// // Time Complexity: O(n)
// // Space Complexity: O(1)

// public class Reversal 
// {
//     public static void main(String[] args) 
//     {

//         int arr [] = {2,4,8,12,14};
//         int n = arr.length;

//         for(int i = 0; i < n/2; i++)
//         {
//             int temp = arr[i];
//             arr[i] = arr[n-i-1];
//             arr[n-i-1] = temp;
//         }    
//         System.out.println("Reversal of an array is: ");
//         for(int i = 0; i < n; i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }
