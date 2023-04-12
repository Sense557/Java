



// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 *  what is interface
 */


// interface A
// {
//     int age = 18;      //public static final
//     void show();        // public abstract

// }
// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
// }



// public class Trial {

//     public static void main(String[] args) {

//         // A obj = new A();
//         // A.show();
//         // A.age = 50     // cannot change as it is public final static
//         System.out.println(A.age);   //without obj creation

//         B obj = new B();
//         obj.show();


//     }
// }



// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 *  Need of Interface with Example
 */


// interface Computer
// {
//     public void compileCode();
// }
// class Laptop implements Computer
// {
//     public void compileCode()
//     {
//         System.out.println("You got 5 errors");
//     }
// }
// class Desktop implements Computer
// {
//     public void compileCode()
//     {
//         System.out.println("You got 5 errors, faster");
//     }
// }
// class Developer
// {
//     void buildApp(Computer computer)
//     {
//         System.out.println("Building an app");
//
//         computer.compileCode();
//     }
// }
// public class Trial {
//
//     public static void main(String[] args) {
//         // Laptop lap = new Laptop();
//         Computer computer = new Desktop();
//         Developer dev = new Developer();
//         dev.buildApp(computer);
//
//     }
// }


//✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
/**
 *  Interface Implementation
 */




// interface A
// {
//     int age = 18;      //public static final
//     void show();        // public abstract
// }
// interface X
// {
//     void abc();
// }
// class B implements A, X
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
//     public void abc()
//     {
//         System.out.println("In abc");
//     }
// }
// public class Trial {

//     public static void main(String[] args) {

//         // A obj = new A();
//         // A.show();
//         // A.age = 50     // cannot change as it is public final static
//         System.out.println(A.age);   //without obj creation

//         B obj = new B();
//         obj.show();
//         obj.abc();
//     }
// }




// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 * Java 8 Features
 */
//
// interface A
// {
//     void config();               //Functional method interface
//     default void show()         //default method interface or non-static
//     {
//         System.out.println("in show");
//     }
//     static void play()          //static method interface
//     {
//         System.out.println("Let's Play");
//     }
// }
// class B implements A
// {
//     public void config()
//     {
//         System.out.println("in config");
//     }
// }
// public class Trial {
//
//     public static void main(String[] args) {
//
//         A.play();
//
//         A obj = new B();
//         obj.show();
//         obj.config();
//     }
// }




// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡


/**
 * Inner Class with the address details
 */

// class A
// {

//     Address add;
//     class Address
//     {
//         String City;
//         String name;
//         int pincode;
//     }
//     public void showOut()
//     {
//         System.out.println("in outer show");
//     }
//     static class B
//     {
//         void showIn()
//         {
//             System.out.println("in inner show");
//         }
//     }
// }
// public class Trial {

//     public static void main(String[] args) {

//         A obj = new A();
//         obj.showOut();

//         // A.B obj1 = obj.new B();  // accessing the normal inner class
//         // obj1.showIn();

//         A.B obj1 = new A.B();   // accessing static inner class
//         obj1.showIn();


//     }
// }



// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡
/**
 *  //  annonymous interface
 *  //  when there is a need to declare and define the interface directly and only once
 */



// interface A
// {
//     void show();
// }
//
// public class Trial {
//
//     public static void main(String[] args) {
//
//         A obj = new A()
//         {
//             public void show()
//             {
//                 System.out.println("in show");
//             }
//         };
//         obj.show();
//
//     }
// }


// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 * Lambda Expression
 * when we need to reduce the code only want to focus on the logic only
 * you can do it for interface using some expression
 */


// // Zero Parameterized interface
// interface A
// {
//     void show();
// }
//
// public class Trial {
//
//     public static void main(String[] args) {
//
//         A obj = () -> System.out.println("in show");
//
//         obj.show();
//
//     }
// }

// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 *  One Parameterized interface
 */



// interface A
// {
//     void show(int age);
// }

// public class Trial {

//     public static void main(String[] args) {

//         A obj = (int age) -> System.out.println("in show  "+age);

//         obj.show(20);

//     }
// }


// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 * two Parameterized interface
 */



// interface A
// {
//     void show(String name, int age);
// }

// public class Trial {

//     public static void main(String[] args) {

//         A obj = (String name, int age) -> System.out.println("in show  "+name+" "+age);

//         obj.show("Alok",20);

//     }
// }

// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡

/**
 * two Parameterized interface
 */


 // Zero Parameterized interface
 interface A
 {
     void show(int a, int b);
 }

 public class Trial {

     public static void main(String[] args) {

         A res = (a,b) -> System.out.println(a+b);
         res.show(30,20);


     }
 }