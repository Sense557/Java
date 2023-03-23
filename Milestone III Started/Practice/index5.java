

// package Practice;

// import java.util.ArrayDeque;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.ListIterator;
// import java.util.PriorityQueue;
// import java.util.concurrent.CopyOnWriteArrayList;

/**
 *  Priority Queue 
 *      -Note
 *          - Characters entry not allowed
 *          - ArrayIndexing also not allowed
 *          - follws Min Heap Data Stracture
 *          - Duplicates allowed (Till Priority Queue But later not allowed)
 *          - Null value also not allowed
 *          
 */

// public class index5 
// {
//     public static void main(String[] args) 
//     {
//         PriorityQueue pq = new PriorityQueue();
//         pq.add(100);
//         pq.add(200);
//         pq.add(50);

//         // pq.add("pq");
//         // pq.add(2,5);
//         // pq.add();
//         pq.add(100);
//         System.out.println(pq);

//     }
// }

// 👏✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️


/**
 *  Array  Deqeue 
 *      Note-
 *          - Order of indexing preserved
 *          - Cannot enter in the middle 
 *          - Follows double ended queue
 *          - Head and tail entry possible not middle
 *          - Duplicates allowed
 *          - Offer funda
 */

//  public class index5 
//  {
//      public static void main(String[] args) 
//      {
//         ArrayDeque ad = new ArrayDeque();
//         ad.add(100);
//         ad.add(200);
//         ad.add(50);

//         ad.addFirst("PW");
//         ad.addLast("Java");
//         ad.add(100);


//         //not necessary to be added like add
//         ad.offer(5);
//         ad.offerFirst(1);
//         ad.offerLast(10);

//         System.out.println(ad);


//         Iterator itr = ad.iterator();
//         while(itr.hasNext())
//         {
//             System.out.println(itr.next());
//         }

//      }
//  }
 

// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉

/**
 *  LinkedList
 *      - follows doubly LinkedList Data Structure
 *      - Order of Indexing preserved
 *      - Duplicates allowed
 *      - Mixed data type also allowed
 *      - Indexbased accessing also allowed
 *      - More effective than ArrayList
 *      - Insertiion and deletion is easy
 *      - here all the values referenced each other and linked like a chain
 * 
 */

//  public class index5 
//  {
//     public static void main(String[] args) 
//     {
//         LinkedList ll = new LinkedList();
//         ll.add(100);
//         ll.add(200);
//         ll.add(300);

//         ll.add("PW");
//         ll.add(100);
//         ll.addFirst(1);
//         ll.addLast(1);
//         ll.add(3, "java");

//         System.out.println(ll.peek());
//         System.out.println(ll.poll());


//         System.out.println(ll);
//     }   
    
//  }



// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉


/**
 *  ArrayList
 *      - follows Dynamic Array Data Structure
 *      - Order of Indexing preserved
 *      - Duplicates allowed
 *      - Mixed data type also allowed
 *      - Indexbased accessing also allowed but not preferrable 
 *              i.e as all the data will shift to it's corresponding index
 *      - More effective than Array
 *      - Insertiion and deletion is easy
 * 
 */

// public class index5
// {
//     public static void main(String[] args) 
//     {
        
//         ArrayList al1=new ArrayList();

//         al1.add(100);
//         al1.add(200);
//         al1.add(300);
//         System.out.println(al1);

//         System.out.println(al1.contains(200));

//         int index=al1.indexOf(300);
//         System.out.println(index);
//         System.out.println(al1.size());

//         al1.ensureCapacity(10);
//         al1.trimToSize();
//         System.out.println(al1.size());

//         al1.clear();
//         System.out.println(al1);

//         List al=new ArrayList();

//         al.add(100);
//         System.out.println(al);
        

//         // System.out.println("****************************************");

//         // ArrayList al2=new ArrayList();

//         // al2.add("PW Skills");
//         // al2.add(1);
//         // al2.add('j');
//         // al2.add(1.1);
        
//         // System.out.println(al2);

//         // System.out.println("****************************************");

//         // al2.add(100);

//         // System.out.println(al2);

//         // System.out.println("****************************************");


//         // ArrayList al3=new ArrayList();

//         // al3.add(1);
//         // al3.add(2);
//         // al3.add(4);
//         // System.out.println(al3);

//         // System.out.println("After adding collection");

//         // al3.addAll(al2);
//         // System.out.println(al3);

//         // al3.add(2, "PW");

//         // System.out.println(al3);
//         // al3.add(100);

//         // System.out.println(al3);
  
//     }
    
// }
