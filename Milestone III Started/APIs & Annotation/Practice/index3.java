// import java.util.*;
// import java.util.function.Consumer;

// /**
//  *      Understanding the concept of forEach() internal bala vs for each loop() external bala
//  */

// public class index3 
// {
//     public static void main(String[] args) 
//     {
//         //Creating the Arraylist 
//         // List <Integer> list = new ArrayList<Integer>();
//         // list1.add(2);
//         // list1.add(4);
//         // list1.add(5);
//         // list1.add(8);
//         // list1.add(10);

//         // System.out.println(list);


//         //Alternate method for Creating the Arraylist (Advances Level)
//         List <Integer> list = Arrays.asList(2,4,5,8,10);
//         System.out.println(list);


//         //using for each external bala trying to preocess the data
//         // for (Integer i : list1) 
//         // {
//         //     System.out.println(i);    
//         // }


//         //using for each internal bala trying to preocess the data (Advances Level)
//         // list.forEach(i -> System.out.println(i));
        

//         //Let's understand what we didi in the internal bala forEach Loop
//         // Consumer <Integer> consumer = i ->System.out.println(i);

//         list.forEach(i ->System.out.println(i));





//     }
// }
