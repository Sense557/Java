// package Practice;
// import java.util.*;
// import java.util.LinkedHashSet;

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


// public class index3 
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
