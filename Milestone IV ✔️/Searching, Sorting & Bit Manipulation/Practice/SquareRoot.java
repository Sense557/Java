// import java.util.*;
// import java.io.*;


// /**
//  *  Square Root
//  */



// public class SquareRoot 
// {

//     public static int findSquareRoot(int num)
//     {
//         int low = 0, high = num, result = -1;

//         while(low <= high)
//         {
//             int mid = low + (high - low)/2;
//             int value = mid * mid;

//             if(value == num)
//             {
//                 //perfext Square root
//                 return mid;
//             }
//             else if(value < num )
//             {
//                 result = mid;
//                 low = mid + 1;
//             }
//             else
//             {
//                 high = mid - 1;
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a num of which you want Square Root"); 
//         int num = sc.nextInt();

//         int result = findSquareRoot(num);
//         System.out.println("Square Root is: "+result);

//     }
// }
