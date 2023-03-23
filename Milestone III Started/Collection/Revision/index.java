package Revision;

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

// public class index
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

//  public class index
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

//  public class index
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
 *  Priority Queue 
 *      -Note
 *          - Characters entry not allowed
 *          - ArrayIndexing also not allowed
 *          - follws Min Heap Data Stracture
 *          - Duplicates allowed (Till Priority Queue But later not allowed)
 *          - Null value also not allowed
 *          
 */

// public class index
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

// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉


/**
 *  TreeSet
 *      Note-
 *          - Duplicates not allowed
 *          - Binary Search is fast
 *          - Follows Binary Search Tree
 *          - Sorted Order
 *          - Characters entry not allowed
 *          - Null value entry also not allowed
 *          - Ceiling & Floor funda
 * 
 *      2 Types of tree
 *      - Balanced  // 10 50 5 2 6 8 25 3 30 35...
 *      - Scewed    //10 20 30 40 50 60 70 80...
 */


// public class index 
// {
//     public static void main(String[] args) 
//     {
//         TreeSet ts = new TreeSet();
//         ts.add(100);
//         ts.add(200);
//         ts.add(300);
//         ts.add(25);
//         ts.add(30);
//         ts.add(80);
//         ts.add(90);
//         // ts.add("PW");
        
        

//         System.out.println(ts.ceiling(10));
//         System.out.println(ts.floor(20));
//         System.out.println(ts.higher(50));
//         System.out.println(ts.lower(30));
//         System.out.println(ts.add(100));
//         // ts.add(); //error
//         System.out.println(ts);

//         // character  and string is not allowed
//         // ts.add("Java");

//         System.out.println(ts);

//     }
// }


// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉



/**
 *  HashSet & LinkedHashSet
 *      - Follows Hashing -> Hash Table
 *      - Order of index not preserved but we can manage using Linkes hashset
 *      - Time complexity O(1)
 *      - sorted order not allowed
 *      - in such a unique way that no need to check each bucket
 *          i.e. it only checks one bucket only and gives it result
 *      - Searching operation is very fast
 *      - loadfactor is .75 i.e 75%
 *      - Duplicates not allowed 
 * 
 *  HashSet
 *      - Not Sorted Order
 * 
 *  LinkedHashSet
 *      - Sorted Order
 * 
 */


// public class index
// {
//     public static void main(String[] args) 
//     {
//         HashSet hs = new HashSet();
//         hs.add(300);
//         hs.add(500);
//         hs.add("PW");

//         System.out.println(hs);

//         Iterator itr = hs.iterator();
//         while(itr.hasNext())
//         {
//             System.out.println(itr.next()+" ");
//         }
        

//         LinkedHashSet lhs = new LinkedHashSet();
//         lhs.add(300);
//         lhs.add(500);
//         lhs.add("PW");


//         System.out.println(lhs);

//     }
// }



// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
/**
 *  Why use Iterator?
 *      - Data manipulation during iteration can lead to get trapped in an infinite loop
 *      - To avoid that we use Iterator
 *      - Then came to the picture fail-fast & fail-safe concept
 * 
 *  Iterator & List Iterator
 * 
 * 
 *  Iterator
 *      - Fail-fast
 *      - user experience - bad
 *      - Act like a cursor
 *      - Prevents us from being trapped in an infinite loop
 * 
 *  ListIterator
 *      - Fail-fast
 *      - user experience - bad
 *      - Fetch the value in the reverse order
 *      - also Prevents us from being trapped in an infinite loop
 * 
 *  CopyOnWriteIterator
 *      - Fail-Safe
 *      - User Experience - Good
 *      - also Prevents us from being trapped in an infinite loop
 */



// public class index1 
// {

//     public static void main(String[] args) 
//     {
//         ArrayList al = new ArrayList();
//         al.add(100);
//         al.add(200);
//         al.add(300);


//         System.out.println(al);

//         // // iterating using for loop
//         // // creates a problem if during iteration trying to manipulate data
//         // // gets trapped in infinite loop
//         // for(int i =0; i<al.size(); i++)
//         // {
//         //     Object o = al.get(i);
//         //     System.out.println(o);
//         //     // System.out.print(al.get(i)+" ");
//         //     // al.add("PW");
//         // }

//         // //for each
//         // for(Object o:al)
//         // {
//         //     System.out.println(o);
//         // }

//         //cursor
//         Iterator itr = al.iterator();
//         while(itr.hasNext())
//         {
//             //Saving & Printing the iteration
//             // Object o = itr.next();
//             // System.out.println(o);


//             //without saving printing the iteration
//            System.out.println(itr.next());

//            //it will create a problem of infinite loop 
//            //if during fetcing adding the data
//             //    al.add("PW");
        
//         }


//         // Reverse order iteration using iterator
//         ListIterator litr = al.listIterator(al.size());
//         while(litr.hasPrevious())
//         {
//             //saving & printing the iteration
//             // Object o = litr.previous();
//             // System.out.println(o);

//             //without saving printing the iteration
//             System.out.println(litr.previous());
//         }
//     }
// }



// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐

/**
 *  Why we are using Iterator instead of for loop
 *      Note-
 *          using for loop fo iteration and get trapped in infinte loop Problem
 *          to avoid this we use iterator 
 * 
 * 
 *  Why Iterator?
 *      - Data manipulation during iteration can lead to get trapped in an infinite loop
 *      - To avoid that we use Iterator
 *      - Then came to the picture fail-fast & fail-safe concept
 */

//  public class index2 
// {
//     public static void main(String[] args) 
//     {
//         ArrayList al = new ArrayList();
//         al.add(100);
//         al.add(200);
//         al.add(300);

//         System.out.println(al);

//         //using for loop fo iteration and get trapped in infinte loop Problem
//         for(int i=0; i<al.size(); i++)
//         {
//             System.out.println(al.get(i));
//             al.add(1);
//         }
//     }
// }

// 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉
/**
 *      Fail-Fast and Fail-Safe
 */
// 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉


// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
/**
 *  Fail-Fast 
 *      - User Experience Bad
 *      - as it gives error which can't be handled
 */


// public class index2 
// {
//     public static void main(String[] args) 
//     {
        // ArrayList al = new ArrayList();
        // al.add(100);
        // al.add(200);
        // al.add(300);

        // System.out.println(al);

        // Iterator itr = al.iterator();
        // while (itr.hasNext()) 
        // {
        //     System.out.println(itr.next());
        //     al.add("PW");

        // }


// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
/**
 *      Fail Safe
 *              - User Experience Good
 *              - error handled
 */

//         CopyOnWriteArrayList al = new CopyOnWriteArrayList();
//         al.add(100);
//         al.add(200);
//         al.add(300);


//         Iterator itr = al.iterator();
//         while (itr.hasNext()) 
//         {
//             System.out.println(itr.next());
//             al.add("PW");

//         }
//         System.out.println(al);
//     }
// }

// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
