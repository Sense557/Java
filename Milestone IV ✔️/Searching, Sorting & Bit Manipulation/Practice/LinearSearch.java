// import java.util.Scanner;

// /**
//  *  Linear Search
//  */




// public class LinearSearch 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         //Getting user input for total length of the array
//         System.out.println("Enter the numbers of elements present in an array");
//         int n = sc.nextInt();

//         //Getting user input for the elements present in the array 
//         System.out.println("Enter the elements present of the array");
//         int arr [] = new int [n];

//         for(int i = 0; i<n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
        
//         //Getting user input for x
//         System.out.println("Enter an element to be search in an array");
//         int x = sc.nextInt();

//         //implementation of linear search
//         int idx = -1;
//         for(int i = 0; i<n; i++)
//         {
//             if(arr[i] == x)
//             {
//                 idx = i;
//                 break;
//             }
//         }

//         if(idx == -1)
//         {
//             System.out.println("Element not found in the array");
//         }
//         else
//         {
//             System.out.println("Elements found in the array at location: "+idx);
//         }
        
//     }
// }
