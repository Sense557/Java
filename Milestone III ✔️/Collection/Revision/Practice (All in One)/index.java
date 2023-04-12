import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐

/**
 *  ArrayList
 *      - follows Dynamic Array Data Structure
 *      - dynamic in nature
 *      - Order of insertion allowed
 *      - Duplicates allowed
 *      - Mixed data also allowed
 *      - index based insertion allowed
 */


// public class index 
// {

//     public static void main(String[] args) 
//     {
//         ArrayList al = new ArrayList();

//         al.add(100);
//         al.add(200);
//         al.add(300);
//         al.add(400);
//         al.add(200);
//         al.add("Hello");
//         al.ensureCapacity(10);   //min capacity
//         System.out.println(al.get(3));  //indexwise call
//         // al.clear();  // all clear
//         al.remove(0);   //Object removal
//         al.add(0, "al");
       


//         System.out.println(al);
//     }
// }

// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  LinkedList
 *      - follows doubly linked list
 *      - Order of insertion allowed
 *      - Duplicates allowed
 *      - Mixed data also allowed
 *      - Index based insertion allowed
 *      - peek , poll, offer new
 */


//  public class index 
//  {

//     public static void main(String[] args) 
//     {
//         LinkedList ll = new LinkedList();
//         ll.add(100);
//         ll.add(200);
//         ll.add(300);
//         ll.add(400);
//         ll.add(200);
//         ll.add("Hello");
        // ll.ensureCapacity(10);   //min capacity
        // System.out.println(ll.get(3));  //indexwise call
        // // al.clear();  // all clear
        // al.remove(0);   //Object removal


//         ll.peek();  //peek only and after peek don't delete
//         ll.poll(); //after peek delete

//         //offer doesn't gurrantee it's addition but add does
//         ll.offer(5);
//         ll.addFirst(1);
//         ll.addLast("Last");
//         ll.add(0, ll);

//         System.out.println(ll);
//     }
// }

// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  ArrayDequeue
 *      - follows que i.e. double ended
 *      - behaves like que i.e. no index based direct into the middle insertion
 *      - only 1st and last entry
 *      - Order of insertion maintained
 *      - duplicates allowed
 *      - 
 * 
 */


//  public class index 
//  {

//     public static void main(String[] args) 
//     {
//         ArrayDeque ad = new ArrayDeque();
//         ad.add(100);
//         ad.add(200);
//         ad.add(300);
//         ad.add(400);
//         ad.addFirst("ad");
//         ad.addLast("ad");
//         ad.add(200);
        
//         ad.clear();
        
        

//         System.out.println(ad);
        
//     }
// }

// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  Priority Queue
 *      - follows min heap data structure
 *      - donot follow order of insertion
 *      - indexbased insertion also not allowed
 *      - duplicates allowed
 */


//  public class index 
//  {

//     public static void main(String[] args) 
//     {
//         PriorityQueue pq = new PriorityQueue();
//         pq.add(200);
//         pq.add(100);
//         pq.add(200);
//         pq.add(300);
//         pq.add(75);
//         pq.add(200);
//         pq.add(300);
//         pq.add(25);
//         pq.offer(30);

//         System.out.println(pq);
//     }
// }




// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  HashSet
 *      - Duplicates not allowed
 *      - follows hashing / hashtable   
 *      - loadfactor .75 i.e on 75% it doubles its size
 *      - order of insertion not allowed (problem solved in LinkedHashSet)
 *      - arranged in an unique way 
 *      - search in a way that only check one bucket and give result
 *      - Binary search is fast
 */


//  public class index 
//  {

//     public static void main(String[] args) 
//     {
//         HashSet hs = new HashSet();
//         hs.add(200);
//         hs.add(100);
//         hs.add(200);
//         hs.add(300);
//         hs.add(75);
//         hs.add(200);
//         hs.add(300);
//         hs.add(25);
        
//         System.out.println(hs);


//     }
// }




// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  LinkedHashSet
 *      --Duplicates not allowed
 *      - follows hashing / hashtable   
 *      - loadfactor .75 i.e on 75% it doubles its size
 *      - order of insertion allowed 
 *      - Binary search is very fast
 *      - search in a way that only check one bucket and give result
 *      - big O time complexity
 *      
 */


//  public class index 
//  {

//     public static void main(String[] args) 
//     {
//         LinkedHashSet lhs = new LinkedHashSet();
//         lhs.add(200);
//         lhs.add(100);
//         lhs.add(200);
//         lhs.add(300);
//         lhs.add(75);
//         lhs.add(200);
//         lhs.add(300);
//         lhs.add(25);
//         System.out.println(lhs);


//     }
// }


// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  TreeSet
 *      - follows Binary Search Tree 
 *      - Order of insertion not allowed
 *      - Duplicates not allowed
 *      - sorted order  ( LVR Method)
 *      - Search is very fast
 *      
 */


//  public class index 
//  {

//     public static void main(String[] args) 
//     {
//         TreeSet ts = new TreeSet();
//         ts.add(200);
//         ts.add(100);
//         ts.add(200);
//         ts.add(300);
//         ts.add(75);
//         ts.add(200);
//         ts.add(300);
//         ts.add(25);

//         System.out.println(ts);
//     }
// }


// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


/**
 *  Iterator
 *      - Only available in List
 *      - accessing and printin is different thing
 *      - we are accessing using iterator
 *      - why not for loop for this iteration ?
 *              - due to concurrent modification 
 *              - will understand broadly in fail-fast and fail-safe 
 */

//  public class index 
//  {

//     public static void main(String[] args) 
//     {
        // ArrayList al = new ArrayList();
        // al.add(200);
        // al.add(100);
        // al.add(200);
        // al.add(300);
        // al.add(75);
        // al.add(200);
        // al.add(300);
        // al.add(25);

        // System.out.println(al);

        // //to avoid infinite loop trap 
        // for(int i=0; i<al.size(); i++)
        // {
        //         System.out.println(al);
        //         al.add(2);
        // }
        


        // //fail-fast
        // Iterator itr = al.iterator();
        // while(itr.hasNext())
        // {
        //         System.out.println(itr.next());
        //         al.add(2);
        // }



        //fail-safe
//         CopyOnWriteArrayList cwa = new CopyOnWriteArrayList();
//         cwa.add(200);
//         cwa.add(100);
//         cwa.add(200);
//         cwa.add(300);
//         cwa.add(75);
//         cwa.add(200);
//         cwa.add(300);
//         cwa.add(25);

//         Iterator itr = cwa.iterator();
//         while(itr.hasNext())
//         {
//                 System.out.println(itr.next());
//                 cwa.add(2);
//         }



//     }
// }




// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


// /**
//  *  Fail-Fast & Fail-Safe
//  */


//  public class index {

//     public static void main(String[] args) {

//         ArrayList al = new ArrayList();
//         al.add(200);
//         al.add(100);
//         al.add(200);
//         al.add(300);
//         al.add(75);
//         al.add(200);
//         al.add(300);
//         al.add(25);

//         System.out.println(al);

//         //to avoid infinite loop trap 
//         for(int i=0; i<al.size(); i++)
//         {
//                 System.out.println(al.get(i));
//                 // al.add(2);
//         }

        
        

        
        
        // //fail-fast
        // Iterator itr = al.iterator();
        // while(itr.hasNext())
        // {
        //         System.out.println(itr.next());
        //         al.add(2);
        // }



        //fail-safe
//         CopyOnWriteArrayList cwa = new CopyOnWriteArrayList();
//         cwa.add(200);
//         cwa.add(100);
//         cwa.add(200);
//         cwa.add(300);
//         cwa.add(75);
//         cwa.add(200);
//         cwa.add(300);
//         cwa.add(25);

//         Iterator itr = cwa.iterator();
//         while(itr.hasNext())
//         {
//                 System.out.println(itr.next());
//                 cwa.add(2);
//         }



//     }
// }



// // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


