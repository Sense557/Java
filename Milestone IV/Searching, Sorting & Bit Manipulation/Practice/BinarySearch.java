// import java.util.Scanner;

// /**
//  *  Binary Search
//  */




// public class BinarySearch 
// {
//     public static int binarySearch(int arr [], int x)
//     {
        
//         int low = 0, high = arr.length-1;
        

//         while(low <= high)
//         {
//             int mid = (low + (high-low))/2;

//             if(arr[mid] == x)
//             {
//                 return mid;
//             }
//             else if (arr[mid] < x)
//             {
//                 low = mid + 1;
//             }
//             else
//             {
//                 high = mid - 1;
//             }
//         }
        
//         return -1;
//     }

//     public static void main(String[] args) 
//     {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int n = sc.nextInt();

//         System.out.println("Enter the elements of the array");
//         int arr [] = new int [n];

//         for(int i=0; i< n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target value to be searched present in the array");
//         int x = sc.nextInt();

//         //implementation of the binary Search

//         int result = binarySearch(arr, x);
        
//         if(result != -1)
//         {
//             System.out.println("Found at: "+result);
//         }
//         else
//         {
//             System.out.println("Not Found ");
//         }
        
//     }
// }
