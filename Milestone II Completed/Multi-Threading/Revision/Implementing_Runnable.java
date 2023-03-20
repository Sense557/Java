// import java.util.Scanner;

// /**
//  *  Creating Threads by implementing Runnable
//  */


//  class Calculation implements Runnable{
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


// class Printing implements Runnable{
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


// class Message implements Runnable{
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


// public class Implementing_Runnable {
//     public static void main(String[] args) {

//         Calculation c = new Calculation();
//         Printing p = new Printing();
//         Message m = new Message();

//         Thread t1 = new Thread(c);
//         Thread t2 = new Thread(p);
//         Thread t3 = new Thread(m);

//         t1.start();
//         t2.start();
//         t3.start();

        
//     }
// }
