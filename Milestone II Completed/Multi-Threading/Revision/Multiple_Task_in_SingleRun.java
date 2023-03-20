// import java.util.Scanner;

// /**
//  *  Creating Threads by implementing Runnable
//  */

//  class MyThread extends Thread{
//     public void run()
//     {
//         String tname = Thread.currentThread().getName();
//         if(tname.equals("CALC"))
//         {
//             calculation();
//         }
//         else if (tname.equals("PRINT")) 
//         {
//             printing();
//         }
//         else
//         {
//             message();
//         }
//     }

//     public void calculation()
//     {
//         System.out.println("Example 1 (Calculation) Task Started **********************");
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
        
//     public void printing()
//     {
//         System.out.println("Example 2 (Printing) Task Started **********************");
//         for(int i=0; i<3; i++) 
//         {
//             System.out.println("*");
//         }
//         System.out.println("Example 2 (Printing) Task Ended **********************");
//     }

//     public void message()
//     {
//         System.out.println("Example 3 (Message) Task Started **********************");
//         for(int i=0; i<3; i++)
//         {
//             System.out.println("🎯");
//         }
//         System.out.println("Example 3 (Message) Task Ended **********************");
//     }
    
//  }



// public class Multiple_Task_in_SingleRun {
//     public static void main(String[] args) {

//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();
//         MyThread t3 = new MyThread();

//         t1.setName("CALC");
//         t2.setName("PRINT");
//         t3.setName("MESSAGE");

//         t1.start();
//         t2.start();
//         t3.start();


        
//     }
// }
