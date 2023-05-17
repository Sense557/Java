// import java.util.Arrays;

// /**
//  *  Insertion Sort
//  */

// // Time Coplexity: O(n^2)
// // Space Complexity: O(1)

// public class InsertionSort 
// {

//     public static void insertionSort(int arr[])
//     {
//         for(int i=1; i<arr.length; i++)
//         {
//             int j = i;
//             while(j>0 && arr[j] < arr[j-1])
//             {
//                 int swap = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1] = swap;

//                 j--;
//             }
//         }
//     }

//     public static void main(String[] args) 
//     {
//         int arr [] = {20,50,25,67,79,12,15};

//         //function calling
//         insertionSort(arr);

//         System.out.println("Sorted array is: ");

//         System.out.println(Arrays.toString(arr));

        
//     }
// }
