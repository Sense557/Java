// package Practice;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.concurrent.CopyOnWriteArrayList;


// ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐

/**
 *  Why we are using Iterator instead of for loop
 *      Note-
 *          using for loop fo iteration and get trapped in infinte loop Problem
 *          to avoid this we use iterator 
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
