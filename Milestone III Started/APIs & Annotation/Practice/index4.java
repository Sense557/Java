// import java.util.*;
// import java.util.stream.Stream;


// /**
//  *      Stream API concept
//  */



// public class index4 
// {
//     public static void main(String[] args) 
//     {
//         //creating an arraylist in a unique way (Advanced-Level)
//         List <Integer> list = Arrays.asList(2,3,5,8,9);    


//         //creating stream of list so that we can do manipulation without affecting the origninal data
//         //once steam is consumed cannot be consumed or used another time
//         Stream <Integer> streamData = list.stream();

//         //accessing the streamdata using forEach internally
//         streamData.forEach(n -> System.out.println(n));

//         //if we try to use it another time it will give runtime error
//         // streamData.forEach(n -> System.out.println(n));
        

//     }    
// }
