// /**
//  * Deadlock
//  */
// class Library implements Runnable{
//     String ref1 = new String("JAVA");
//     String ref2 = new String("SQL");
//     String ref3 = new String("DSA");

//     public void run(){
//         String name = Thread.currentThread().getName();
//         if(name.equals("STUDENT-1"))
//         {
//             try 
//             {
//                 Thread.sleep(3000);
//                 synchronized (ref1)
//                 {
//                     System.out.println("Student-1 acquired "+ref1);
//                     Thread.sleep(3000);

//                     synchronized (ref2)
//                     {
//                         System.out.println("Student-1 acquired "+ref2);
//                         Thread.sleep(3000);

//                         synchronized (ref3)
//                         {
//                             System.out.println("Student-1 acquired "+ref3);
//                         }
//                     }
//                 }
//             } 
//             catch (Exception e) 
//             {
//                 System.out.println("some problem occured");
//             }
//         }
//         else
//         {
//             try 
//             {
//                 Thread.sleep(3000);
//                 synchronized (ref3)
//                 {
//                     System.out.println("Student-2 acquired "+ref3);
//                     Thread.sleep(3000);

//                     synchronized (ref2)
//                     {
//                         System.out.println("Student-2 acquired "+ref2);
//                         Thread.sleep(3000);

//                         synchronized (ref1)
//                         {
//                             System.out.println("Student-2 acquired "+ref1);
//                         }
//                     }
//                 }
//             } 
//             catch (Exception e) 
//             {
//                 System.out.println("some problem occured");
//             }
//         }

//     }
// }


// public class Deadlock {

//     public static void main(String[] args) {

//         Library lib = new Library();

//         Thread t1 = new Thread(lib);
//         Thread t2 = new Thread(lib);
        
//         t1.setName("STUDENT-1");
//         t2.setName("STUDENT-2");

//         t1.start();
//         t2.start();

//     }
// }