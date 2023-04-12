// import java.util.*;
// import java.util.function.Predicate;
// import java.util.stream.Stream;


// public class index5 
// {
//     public static void main(String[] args) 
//     {
//         List <Integer> list = Arrays.asList(2,1,51,10,3);

//         Stream <Integer> streamData = list.stream();

        

//         // Stream <Integer> filStream= streamData.filter(n -> n%2==0);
//         // filStream.forEach(n -> System.out.println(n));

//         //counting 
//         // long counStream = streamData.count();
//         // System.out.println(counStream);
        
        

        
//         // it will conunt only when it is being printed or iterated otherwise no
//         // Stream <Integer> sortedStream = streamData.sorted();
//         // Stream <Integer> mapStream = sortedStream.map(n -> n*2);
//         // Stream <Integer> filStream = mapStream.filter(n -> n% 2==0);
//         // filStream.forEach(n -> System.out.println(n));


//         // the above group of methods can also be written as this because it all is being chained by one another
//         // i.e because their return type is same


//         //let's understand the predicate why we directly do lambda integration i need to understand
        
            
        

//         Stream <Integer> finlaStream = streamData

//         .sorted()
//         .map(n -> n+2)
//         .filter(i ->i%2==0);
 
//         finlaStream.forEach(n-> System.out.println(n));
        


//         // streamData.forEach(n -> System.out.println(n));




        


//     }    
// }
