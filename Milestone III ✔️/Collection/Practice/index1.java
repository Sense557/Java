// package Practice;

// import java.util.*;

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
