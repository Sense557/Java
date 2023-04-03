
// import java.util.*;

// /**
//  *  Comparator vs comparable
//         Example of Comparator
//  */


// class Student
// {
//     int marks;
//     int age;
//     String name;

//     public Student(int marks, int age, String name) 
//     {
//         this.marks = marks;
//         this.age = age;
//         this.name = name;
//     }

//     public int getMarks() {
//         return marks;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Student [marks=" + marks + ", age=" + age + ", name=" + name + "]";
//     }
    
// }

// // class Alpha implements Comparator <Student>
// // {
// //     public int  compare (Student a, Student b)
// //     {
// //         if(a.marks > b.marks)
// //         {
// //             return 1;
// //         }
// //         else
// //         {
// //             return -1;
// //         }
// //     }
// // }


// public class Com_1 
// {
//     public static void main(String[] args) 
//     {
//         Student st1 =  new Student(70, 15, "Rohan");
//         Student st2 =  new Student(80, 14, "Rohit");
//         Student st3 =  new Student(90, 15, "Rahul");


//         Comparator <Student> cm = (Student a, Student b) ->
//             {
//                 if(a.marks > b.marks)
//                 {
//                     return 1;
//                 }
//                 else
//                 {
//                     return -1;

//                 }
            
//         };

//         List <Student> list  =  new ArrayList <Student> ();    
//         list.add(st1);
//         list.add(st2);
//         list.add(st3);




//         Collections.sort(list, cm);
//         System.out.println(list);




//     }
    
// }