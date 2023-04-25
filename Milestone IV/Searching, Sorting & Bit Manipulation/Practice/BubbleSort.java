// import java.util.Arrays;

// /**
//  *  Bubble Sort
//  */

// // time complexity: O(log N)
// // space complexity: O(1)

// public class BubbleSort 
// {

//     static void bubbleSort(int arr[])
//     {

//         for(int i = 0; i<arr.length; i++)
//         {
//             boolean swapped = false;

//             //for every iteration we get the biggest element in the end of the array
//             for( int j = 0; j< arr.length - i - 1; j++)
//             {

//                 while(arr [j] > arr[j+1])
//                 {
//                     // swap between arr[i] and arr[j+1]
//                     int temp = arr[j];
//                     arr [j] = arr [j+1];
//                     arr [j+1] = temp;

//                     swapped = true;
//                 }
//             }
//             if(!swapped)
//             {
//                 break;
//             }
//         }
//     }



//     public static void main(String[] args) 
//     {
//         int arr [] = {10, 50, 10, 12, 45, 67, 90};

//         bubbleSort(arr);

//         System.out.println("Sorted Array is: ");
//         System.out.println(Arrays.toString(arr));
        
//     }
// }
