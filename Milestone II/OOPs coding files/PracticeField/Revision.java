package PracticeField;

/**
 * //INHERITANCE
 */


// class Animal 
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {

// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }    
// }

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * Private Keyword
 * PRIVATE KEYWORD CANNOT BE USED IN INHERITANCE
 * i.e. PRIVATE CANNOT BE INHERITED
 */


// class Animal 
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {

// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }    
// }

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 * TYPES OF INHERITANCE
 *      SINGLE LEVEL INHERITANCE
 *      MULTI LEVEL
 *      HERERARCHICAL
 *      MULTIPLE ------------> Not allowed
 *
 */


/**
 * //SINGLE LEVEL INHERITANCE
 */

// class Animal 
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {

// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }    
// }

// ----------------------------------------------------------------------------------------------------------------------------------


// MULTI-LEVEL INHERITANCE

// class Animal
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {

// }
// class Monkey extends Tiger
// {

// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
//         Monkey obj = new Monkey();
//         obj.eat();
//     }
// }
// // ----------------------------------------------------------------------------------------------------------------------------------




// HERERARCHICAL INHERITANCE
// ONE PARENT MANY CHILD

// class Animal
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {

// }
// class Monkey extends Animal
// {

// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
//         Monkey obj = new Monkey();
//         obj.eat();
//     }
// }

// ----------------------------------------------------------------------------------------------------------------------------------

//MULTIPLE LEVEL INHERITANCE (NOT ALLOWED IN JAVA)
// AS JAVA IS OOPs LIKE IN THE REAL WORLD ONE CHILD CAN HAVE ONLY ONE PARENT SO THIS IS ALSO HAPPENING IN JAVA
// THIS IS WHY MULTIPLE INHERITANCE NOT ALLOWED
// BUT THIS PROBLEM SOLVED IN INTERFACE (NEXT LECTURE)
 

// class Lion
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger 
// {

// }
// //error shown as it is not possible in java
// // multiple inheritance not allowed
// class Monkey extends Lion, extends Tiger
// {

// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
//         Monkey obj = new Monkey();
//         obj.eat();
//     }
// }


// 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * TYPES OF METHODS IN JAVA
 *      INHERITED METHOD
 *      OVERRIDEN METHOD
 *      SPECIALIZED METHOD
 *
 *              INHERITED METHOD IS NOTHING BUT THE SINGLE INHERITANCE LIKE i.e
 *              INHERITED THE BEHAVIOUR OF HIS PARENT AS IT IS
 */



// class Animal 
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {

// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }    
// }

// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 * // TYPES OF METHODS IN JAVA
 * // INHERITED
 * // OVERRIDEN
 * // SPECIALIZED
 */





//OVERRIDEN METHOD IS NOTHING BUT THE CUSTOMIZED METHOD OF HIS PARENT i.e 
// THE MODIFIED BEHAVIOUR  

// class Animal 
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {
//     //overriden method
//     void eat ()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
   
    
// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }    
// }
// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 * RULES TO OVERRIDE IN INHERITANCE
 * CANT REDUCE THE VISIBILITY OF THE CLASS
 * DATA TYPE SHOULD BE SAME ---- ELSE ERROR
 * PARAMETER SHOULD BE SAME ---- ELSE IT WILL BE CONSIDERED AS METHOD OVERLOADING
 */



    

// class Animal
// {
//     public void eat ()
//     {
//         System.out.println("Animal eats");
//     }
//     public int jump ()
//     {
//         return 30;
//     }
//     public int run ()
//     {
//         return 30;
//     }
// }
// class Tiger extends Animal
// {
//     // void eat()   //cant reduce the visibility 
//     // {
//     //     System.out.println("Hello");
//     // }

//     // public void jump ()  //data type of the method should be same
//     // {
//     //     System.out.println("can jump"); 
//     // }
//     // public int run (int x) //no error as it is considered as other method like we discussed in our method overloading class
//     // {
//     //     return 30;
//     // }


// }
// class Monkey extends Tiger
// {

// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
//         Monkey obj = new Monkey();
//         obj.eat();
//     }
// }
    

// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * //SPECIALIZED METHOD IN INHERITANCE
 * //specialized method can also be inherited to its child as it will become parental for its child
 * // we cant use in parent only in polymorphism using downcasting possible
 */


// class Animal 
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {
//     //overriden method
//     void eat ()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
   
    
// }
// class Monkey extends Animal
// {
//     //overriden method
//     void eat ()
//     {
//         System.out.println("Monkey eats");
//     }

//     //specialized method not present in parent
//     // purely developd by its child
    
//     void jump()
//     {
//         System.out.println("Monkey jump long");
//     }
// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Monkey obj = new Monkey();
//         obj.eat();
//         obj.jump();
//     }    
// }




// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * CONSTRUCTOR IN INHERITANCE
 *
 * in inheritance for constructor execution we just neew to create obj only nothing else
 * // everything will be done by super() by itself
 * // and where there is no super() it is used internally by java
 * // internally jvm uses super() to promote constructor chaining in java
 * // super () keyword is used to call the constructor of parent from its child class
 */




// class Animal
// {
//     public Animal ()
//     {
//         System.out.println("Animal eats");
//     }
//     public Animal (int x)
//     {
//         System.out.println("Animal eats");
//     }

// }
// class Tiger extends Animal
// {
//     public Tiger ()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
// }

// class Monkey extends Animal
// {
//     public Monkey ()
//     {
//         super();
//         System.out.println("Monkey brings and eats");
//     }

// }

// class Deer extends Animal
// {

// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
//         Deer obj = new Deer();
//         Monkey obj1 = new Monkey();
        
//     }
// }


// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * POLYMORPHISM
 *
 *       EXAMPLE 1
 */



// class Animal
// {
//     void eat()
//     {
//         System.out.println("Animal eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Animal sleeps");
//     }

// }
// class Tiger extends Animal
// {
//     void eat()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger also sleeps");
//     }
// }


// class Deer extends Animal
// {
//     void eat()
//     {
//         System.out.println("Deer eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Deer need sleep");
//     }
// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
//         Tiger obj1 = new Tiger();
//         Deer obj = new Deer();

//         Animal ref;

        
//         // obj1 = ref;  //error as parent class properties child cant hold but viceversa possible
//         // obj = ref;

//         ref = obj1;

//         ref.eat();
//         ref.sleep();

//         ref = obj;

//         ref.eat();
//         ref.sleep();

        
        
        
//     }
// }


// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * EXAMPLE 2 (POLYMORPHISM)
 */


// class Animal
// {
//     void eat()
//     {
//         System.out.println("Animal eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Animal sleeps");
//     }

// }
// class Tiger extends Animal
// {
//     void eat()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger also sleeps");
//     }
// }


// class Deer extends Animal
// {
//     void eat()
//     {
//         System.out.println("Deer eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Deer need sleep");
//     }
// }

// class Forest
// {
//     void call(Animal ref)
//     {
//         ref.eat();
//         ref.sleep();
//     }
// }

// public class Revision 
// {

//     public static void main(String[] args) 
    
//         Animal ref1 = new Tiger();
//         Animal ref2 = new Deer();

        
//         ref1.eat();
//         ref1.sleep();

//         ref2.eat();
//         ref2.sleep();

       
//     }
// }
// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * Example 3
 */


// class Animal
// {
//     void eat()
//     {
//         System.out.println("Animal eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Animal sleeps");
//     }
    

// }
// class Tiger extends Animal
// {
//     void eat()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger also sleeps");
//     }
//     void roar ()
//     {
//         System.out.println("Tiger roars");
//     }
// }


// class Deer extends Animal
// {
//     void eat()
//     {
//         System.out.println("Deer eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Deer need sleep");
//     }
// }

// class Forest
// {
//     void call(Animal ref)
//     {
//         ref.eat();
//         ref.sleep();
//     }
// }

// public class Revision 
// {

//     public static void main(String[] args) 
//     {
    
//         Animal ref1 = new Tiger();
//         Animal ref2 = new Deer();
//         Forest obj = new Forest();

        
//         obj.call(ref1);
//         obj.call(ref2);
          
//     }
// }



// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * //EXAMPLE 4 (abstraction and downcasting at the same time)
 *
 * //abstraction just hide unnecessary daata but shows the necessary one
 * // reduce the lines of code
 * //doing downcasting we can access the specialized method of the child class by parent class
 */



// abstract class Animal
// {

//     //pure 100% abstraction achieved till we not use the other normal method
//     abstract void eat();
    
//     abstract void sleep ();

//     //as normal method used in this we cant say we achieved 100% abstraction
//     public void jump()
//     {
//         System.out.println("Animal also jumps");
//     }
    

// }
// class Tiger extends Animal
// {
//     void eat()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger also sleeps");
//     }
//     void roar ()
//     {
//         System.out.println("Tiger roars");
//     }
// }


// class Deer extends Animal
// {
//     void eat()
//     {
//         System.out.println("Deer eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Deer need sleep");
//     }
// }

// public class Revision 
// {

//     public static void main(String[] args) 
    
//         Animal ref1 = new Tiger();
//         Animal ref2 = new Deer();
        

//         ref1.eat();
//         ref1.sleep();
//         ((Tiger) ref1).roar();  //here we are accessing the specialized method of the child classs by parent class ref doing downcasting
        
        

       
//     }
// }



// //🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

//FINAL KEYWORD IN POLYMORPHISM
    //FINAL CLASS --- NOT ALLOWED IN JAVA
    //FINAL METHOD --- ALLOWED BUT CANT MODIFY
    //FINAL VARIABLE --- ALLOWED BUT CANT MODIFY

// final class Animal  //error final class cant have subclass 
// {
//     final int age = 10; //final variable cant be modified
//     final void eat ()  //cant override the final method
//     {
//         age =20;
//         System.out.println("Animal eats");
//     }
// }
// class Tiger extends Animal
// {
//     void eat ()  
//     {
//         System.out.println("Tiger kills");
//     }
// }

// public class Revision 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }    
// }


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️------JAVA OOPS COMPLETED TILL NOW----------️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️