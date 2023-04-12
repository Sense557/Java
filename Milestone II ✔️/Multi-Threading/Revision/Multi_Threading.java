// import java.util.Scanner;

// /**
//  *  MULTI-THREADING
//  */

// class Calculation extends Thread{
//     public void run()
//     {

//     System.out.println("Example 1 (Calculation) Task Started **********************");
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Please Enter 1st number");
//         int num1 = sc.nextInt();
        
//         System.out.println("Please Enter 2nd number");
//         int num2 = sc.nextInt();

//         int result = num1 + num2;
//         System.out.println(result);
//         System.out.println("Example 1  (Calculation) Task Ended **********************");

//         sc.close();
//     }
// }


// class Printing extends Thread{
//     public void run()
//     {
//         System.out.println("Example 2 (Printing) Task Started **********************");
//         for(int i=0; i<3; i++) 
//         {
//             System.out.println("*");
//         }
//         System.out.println("Example 2 (Printing) Task Ended **********************");
//     }
// }


// class Message extends Thread{
//     public void run()
//     {
//         System.out.println("Example 3 (Message) Task Started **********************");
//         for(int i=0; i<3; i++)
//         {
//             System.out.println("🎯");
//         }
//         System.out.println("Example 3 (Message) Task Ended **********************");
//     }
// }

        
        

// public class Multi_Threading {
//     public static void main(String[] args) {

//         Calculation t1 = new Calculation();
//         Printing t2 = new Printing();
//         Message t3 = new Message();

//         t1.start();
//         t2.start();
//         t3.start();

//     }
// }
