// import java.util.Scanner;

// /**
//  *  Try Linear Search
//  */




// public class TryLinear 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of the array");
//         int n = sc.nextInt();
        
//         System.out.println("Enter the elements of the array");
//         int arr [] = new int [n];

//         for(int i=0; i<n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }


//         System.out.println("Enter the target element to be searched in the array");
//         int x = sc.nextInt();

//         //implementation of the linear search
//         int idx = -1;
//         for(int i=0; i<n; i++)
//         {
//             if(arr[i] == x)
//             {
//                 idx = i;
//                 break;
//             }
//         }

//         if(idx == -1)
//         {
//             System.out.println("Not found");
//         }
//         else
//         {
//             System.out.println("Found at the location: "+idx);
//         }
//     }
// }
