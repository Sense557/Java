/**
 * LaunchPC
 */


// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
/**
 *  Producer-Consumer Problem arised
 */

// class Queue
// {
//     int x;
//     public void put(int j)
//     {
//         x=j;
//         System.out.println("I have produced value x "+x);
//     }
//     public void get()
//     {
//         System.out.println("I have consumed value x "+x);
//     }
// }


// class Producer extends Thread
// {
//     Queue q;

//     Producer (Queue b)  //parameterized constructor Queue type value taking
//     {
//         q=b;
//     }

//     public void run()
//     {
//         int i=1;
//         while(true)
//         {
//             q.put(i++);
//         }
        
//     }
// }

// class Consumer extends Thread
// {
//     Queue q;

//     Consumer (Queue a)
//     {
//         q=a;
//     }
//     public void run()
//     {
//         while(true)
//         {
//             q.get();
//         }
        
//     }
// }


// public class LaunchPC 
// {
//     public static void main(String[] args) 
//     {
//         Queue q = new Queue();
//         Producer p = new Producer(q);
//         Consumer c = new Consumer(q);

//         p.start();
//         c.start();

//     }
    
// }




// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐

/**
 *  Solving the Producer-Consumer Problem using the wait() & notify() method
 */

// class Queue
// {
//     int x;
//     boolean flag = false;
//     synchronized public void put(int j)
//     {
//         try 
//         {
//             if(flag==true)
//             {
//                 wait();
//             }
//             else
//             {
//                 x=j;
//                 System.out.println("I have produced value x "+x);
//                 flag = true;

//                 notify();
//             }
            
            
//         }
//         catch (Exception e)
//         {
//             System.out.println("kuch problem hogaya");

//         }
        
//     }
//     synchronized public void get()
//     {
//         try 
//         {
//             if(flag == false)
//             {
//                 wait();
//             }
//             else
//             {
//                 System.out.println("I have consumed value x "+x);
//                 flag = false;

//                 notify();
//             }
            
//         } 
//         catch (Exception e) 
//         {
//             System.out.println("something went wrong");
//         }
        
//     }
// }


// class Producer extends Thread
// {
//     Queue q;

//     Producer (Queue b)  //parameterized constructor Queue type value taking
//     {
//         q=b;
//     }

//     public void run()
//     {
//         int i=1;
//         while(true)
//         {
//             q.put(i++);
//         }
        
//     }
// }

// class Consumer extends Thread
// {
//     Queue q;

//     Consumer (Queue a)
//     {
//         q=a;
//     }
//     public void run()
//     {
//         while(true)
//         {
//             q.get();
//         }
        
//     }
// }


// public class LaunchPC 
// {
//     public static void main(String[] args) 
//     {
//         Queue q = new Queue();
//         Producer p = new Producer(q);
//         Consumer c = new Consumer(q);

//         p.start();
//         c.start();

//     }
    
// }


// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
