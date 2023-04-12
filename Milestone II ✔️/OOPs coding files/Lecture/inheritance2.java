
// //SINGLE LEVEL INHERITANCE AND AT THE SAME TIME USE OF CONSTRUCTOR IN INHERITANCE DEMONSTRATION
// // USE OF PRIVATE MEMBERS ALSO


// class Human1
// {
//     private String name;
//     int age;

//     Human1()
//     {
//         System.out.println("Human1 constructor");
//     }

//     void sleep ()
//     {
//         age = 18;
//         System.out.println("Human need sleep");
//         System.out.println(age);
//     }
// }

// class Student1 extends Human1
// {
//     // public Student1()
//     // {
//     //     super();
//     // }


//     void disp()
//     {
//         System.out.println("Your age is: "+age);
//         // System.out.println("Your name is: "+name);
//     }
// }


// public class inheritance2 
// {

//     public static void main(String[] args) 
//     {
//         Student1 obj = new Student1();
//         obj.sleep();
//         obj.disp();

        
//     }
// }