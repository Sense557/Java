// package Practice;

// import java.util.*;

// import java.util.ArrayList;

// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
/**
 *  ArrayList
 *      Note-
 *          -Duplicates allowed
 *          -Order of Indexing is preserved
 *          -mixed i.e. (Homogenous & Heterogenious data is allowed)
 * 
 *      
 */


// public class index
// {
//     public static void main(String[] args) 
//     {
//         ArrayList al = new ArrayList();

//         //adding values manually 10,20,30,40,50
//         al.add(10);
//         al.add(20);
//         al.add("PW");
//         al.add(1.1);

//         System.out.println(al);
//         System.out.println(al.size());
//         System.out.println(al.contains(500));
//         al.ensureCapacity(10);
//         al.remove(1);    
//         System.out.println(al);   //[10, PW, 1.1]
//         al.clone();
//         al.add(0, 5); 
//         System.out.println(al);
//         System.out.println(al.isEmpty());
//         al.clear();     
//         System.out.println(al);     //[]
//         System.out.println(al.isEmpty());
        
//         System.out.println(al);
        
//         al.add(100);
//         al.add(200);
        

//         for(int i = 0; i<al.size(); i++)
//         {
//             System.out.print(al.get(i)+" ");   //100 200
//         }
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *      iterating the arraylist using for loop
 */

// public class index
// {
//     public static void main(String[] args) 
//     {

//         //initialize arraylist
//         ArrayList al1 = new ArrayList();

//         //adding values from 1-5 using for loop
//         for(int i =1; i<=5; i++){
        
//             al1.add(i);
//         }
//         System.out.println(al1);

//         al1.remove(3);

        
//         System.out.println(al1.indexOf(5));
        
        
 
        

//         // Displaying the ArrayList
//         // after deletion
//         System.out.println(al1);

//         //printing the elements one by one
//         for(int i=0; i<al1.size(); i++)
//         {
//            System.out.print(al1.get(i)+" ");
//         }
    
//     }
// }
// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  LinkedList
 */

//  public class index
// {
//     public static void main(String[] args) 
//     {
        // LinkedList ll = new LinkedList();

        // for(int i=10; i<=15; i++)
        // {
        //     ll.add(i);
        // }
        // System.out.println(ll);

//         ll.add(100);
//         ll.add(200);
//         ll.add("PW");
//         ll.add(100);
//         ll.add(1.1);
//         ll.add('j');
//         ll.add(100);
//         System.out.println(ll);

        
//         System.out.println(ll.peek());
        
//         // System.out.println(ll.poll());
//         System.out.println(ll);
//         ll.push(500);
//         System.out.println(ll.lastIndexOf(100));
//         System.out.println(ll.pop());
//         System.out.println(ll.getFirst());
//         System.out.println(ll.getLast());
 


//         for(int i=0; i<ll.size(); i++)
//         {
//             System.out.print(ll.get(i)+" ");
//         }
        

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  List
 */
            // List l = new LinkedList();
            // l.add(100);
            // l.add("Shakti");
            // System.out.println(l);

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
/**
 *  Queue
 */

//  public class index
//  {
//      public static void main(String[] args) 
//      {

//         Deque dq = new LinkedList();
//         dq.add(1);
//         dq.add("PW");
//         System.out.println(dq.peek());
//         // q.poll();
        
//         System.out.println(q);

//     }
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  ArrayDeque 
 *      Note-
 *      - Indexbased accessing not allowed here
 *      - front end & back end entry allowed but not from the middle like queue
 *      - Duplicates are allowed
 *      - Order of index is preserved
 *      - Offer()
 * 
 */
//  public class index
// {
//     public static void main(String[] args) 
//     {
//         // Deque <Integer> ad = new ArrayDeque();
//         Deque ad = new ArrayDeque();
//         ad.add(100);
//         ad.add(500);
//         ad.add(1);
//         System.out.println(ad);

//         ad.addFirst("PW");
//         ad.addLast("Java");

//         //not mandatory to get added though it works like add but not mandatory
//         ad.offer(1);
//         ad.offerFirst(2);
//         ad.offerLast(3);
//         System.out.println(ad);

//         System.out.println(ad.remove());

//         // System.out.println(ad.hashCode());
//         System.out.println(ad);



//         // for(Integer element:ad)
//         // {
//         //     System.out.print(element+" ");
//         // }


//     }
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
/**
 *      PriorityQueue
 * 
 *      Note-
 *      - Indexbased accessing not allowed here
 *      - front end & back end entry allowed but not from the middle like queue
 *      - Duplicates are allowed
 *      - Order of index is preserved
 *      - Offer()
 */


 public class index {
 
        public static void main(String[] args) {
                PriorityQueue pq = new PriorityQueue();
                pq.add(100);
                pq.add(50);
                pq.add(500);
                pq.add(75);
                System.out.println(pq);

        }
 }
