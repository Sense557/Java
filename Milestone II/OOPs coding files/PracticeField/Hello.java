package PracticeField;

// SINGLE LEVEL INHERITANCE

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



// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }
// }

// ----------------------------------------------------------------------------------------------------------------

// MULTI- LEVEL INHERITANCE

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



// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }
// }


// ----------------------------------------------------------------------------------------------------------------

// HERIRARCHICAL INHERITANCE


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



// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }
// }

// ----------------------------------------------------------------------------------------------------------------

// MULTIPLE INHERITANCE
// SHOWS ERROR AS MUTIPLE PARENT IS NOT POSSIBLE IN REAL LIFE ALSO AS IT IS OOPS

// class Animal
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Tiger 
// {   
    
// }
// class Monkey extends Animal, extends Tiger 
// {

// }



// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }
// }

// ----------------------------------------------------------------------------------------------------------------


// METHODS OF INHERITANCE
    // INHERITED
    // OVERRIDEN
    //SPECIALIZED


// INHERITED/DERIVED

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




// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//     }
// }



// ----------------------------------------------------------------------------------------------------------------



// // OVERRIDEN AND SPECIALIZED METHOD AT THE SAME TIME IN THIS EXAMPLE

// class Animal
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
//     void sleep()
//     {
//         System.out.println("Animal sleeps");
//     }
// }
// class Tiger extends Animal
// {   

//     //eat method is overriden (invisible to us as method)
//     //which is not visible to us as developer it is doing behind the scene


//     //overriden (a customized method present in the parent class modified in its child class)
//     void sleep()
//     {
//         System.out.println("Tiger after hunting sleeps");
//     }

//     //specialized (totally new method not present in the parent class)
//     void roar()
//     {
//         System.out.println("Tiger roars");  
//     }
// }




// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//         obj.sleep();
//         obj.roar();
//     }
// }

// -------------------------------------------------------------------------------------------------------------------------------------





// OVERRIDEN AND SPECIALIZED METHOD AT THE SAME TIME IN THIS EXAMPLE

// class Animal
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
//     void sleep()
//     {
//         System.out.println("Animal sleeps");
//     }
// }
// class Tiger extends Animal
// {   

//     //eat method is overriden (invisible to us as method)
//     //which is not visible to us as developer it is doing behind the scene


//     //overriden (a customized method present in the parent class modified in its child class)
//     void sleep()
//     {
//         System.out.println("Tiger after hunting sleeps");
//     }

//     //specialized (totally new method not present in the parent class)
//     void roar()
//     {
//         System.out.println("Tiger roars");  
//     }
// }




// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//         obj.sleep();
//         obj.roar();
//     }
// }



// ----------------------------------------------------------------------------------------------------------------




// RULES TO OVERRIDE the METHODs IN CHILD CLASS------ 3 TYPES
    // ACCESS MODIFIERS VISIBILITY ----- (SHOULD NOT DECREASE)----else show error
    // DATA TYPES ----(SHOULD BE SAME)-----else show error
    // PARAMETERS  ------ (SHOULD BE SAME) else it will be considered as the concept of method overloading
    //   that method can be same but diff in parameter is method overloading


// class Animal
// {
//     void eat ()
//     {
//         System.out.println("Animal eats");
//     }
//     public void age (int age)
//     {
//         System.out.println("this is age ");
//     }
// }
// class Tiger extends Animal
// {   
    // private void age ()  ////this is the worng way i.e it is not following the overriding rule hence error shown
    // {
    //     return age;
    // }


//     //this is the right way using same parameter, same data type and not decreasing the visibility
//     public void age (int age)   
//     {
//         System.out.println("this is right way to override methods in child class");
//     }
    
// }

// class Monkey extends Animal
// {

// }



// public class Hello {
//     public static void main(String[] args) {
//         Tiger obj = new Tiger();
//         obj.eat();
//         obj.age(0)
//     }
// }

// ----------------------------------------------------------------------------------------------------------------


//CONSTRUCOR EXECUTION IN CASE OF INHERITANCE LEVEL
        // USES super()
        // used to make call the constructor of parent class
        // internally jvm uses super() to promote constructor chaining if in any case it is not there


// class Aeroplane6
// {
//     int a,b;
//     public Aeroplane6()
//     {
//         System.out.println("Parent Class zero parameterized constructor");
//     }
//     public Aeroplane6(int x, int y)
//     {
//         System.out.println("Parent class parameterized constructor");
//         a=x;
//         b=y;
//     }

// }
// class Cargoplane extends Aeroplane6
// {
//     int m,n;
//     public Cargoplane()
//     {
//         // super();
//         // this();
//         System.out.println("Child class zero parameterized constructor");
//     }
//     public Cargoplane(int x, int y)
//     {
//         System.out.println("child class parameterized constructor");
//         m=x;
//         n=y;
//     }
// }



// public class Hello 
// {
//     public static void main(String[] args) 
//     {
//         Cargoplane obj = new Cargoplane();
         
//     }
    
// }





// ----------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------


// POLYMORPHISM


//EXAMPLE 1

// class Animal
// {
//     void eat ()
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
//     void eat ()
//     {
//         System.out.println("Tiger hunts and eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger sleeps");
//     }
// }
// class Monkey extends Animal
// {
//     void eat ()
//     {
//         System.out.println("Monkey brings and eats");
//     }
//     void sleep ()
//     {
//         System.out.println("Monkey sleeps");
//     }
// }

// public class Hello 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         Monkey obj1 = new Monkey();   

//         Animal ref;

//         // Tiger = ref;  //error
//         // Monkey = ref;  //error

//         ref = obj;
//         ref.eat();
//         ref.sleep();

        
//         ref = obj1;
//         ref.eat();
//         ref.sleep();

        
//     }
    
// }

// ----------------------------------------------------------------------------------------------------------------


// //EXAMPLE 2


// class Animal
// {
//     void eat ()
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

//     void eat ()
//     {
//         System.out.println("Tiger hunts and eat");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger sleeps");
//     }
// }
// class Monkey extends Animal
// {

//     void eat ()
//     {
//         System.out.println("Monkey brings and eat");
//     }
//     void sleep ()
//     {
//         System.out.println("Monkey sleeps");
//     }
// }
// class Forest 
// {
//     public void call (Animal ref)
//     {
//         ref.eat();
//         ref.sleep();
//     }
// }


// public class Hello 
// {
//     public static void main(String[] args) 
//     {
//         Tiger obj = new Tiger();
//         Monkey obj1 = new Monkey();

//         Forest obj2 = new Forest();
//         obj2.call(obj);
//         obj2.call(obj1);

//     }
    
// }




// ----------------------------------------------------------------------------------------------------------------


//EXAMPLE 3

// class Animal
// {
//     void eat ()
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

//     void eat ()
//     {
//         System.out.println("Tiger hunts and eat");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger sleeps");
//     }
// }
// class Monkey extends Animal
// {

//     void eat ()
//     {
//         System.out.println("Monkey brings and eat");
//     }
//     void sleep ()
//     {
//         System.out.println("Monkey sleeps");
//     }
// }



// public class Hello 
// {
//     public static void main(String[] args) 
//     {
//         Animal ref1 = new Tiger();
//         Animal ref2 = new Monkey();

//         ref1.eat();
//         ref1.sleep();

//         ref2.eat();
//         ref2.sleep();

//     }
    
// }

// ----------------------------------------------------------------------------------------------------------------





//EXAMPLE 4 (ABSTRACTION + DOWNCASTING)
    // Abstraction and Downcasting happening at the same time
    // abstraction ----- for hiding the unnecessary data but showing the necessary data 
    // downcasting ----- for accessing the child class specialized method
    // normal method can also be present in the abstract but the main problem is we can achieve 100% abstraction
    //


// abstract class Animal
// {
//     abstract void eat ();
    
//     abstract void sleep ();

//     public void happy()
//     {
//         System.out.println("Animal happy always");
//     }
// }
// class Tiger extends Animal
// {

//     void eat ()
//     {
//         System.out.println("Tiger hunts and eat");
//     }
//     void sleep ()
//     {
//         System.out.println("Tiger sleeps");
//     }
//     void jump ()
//     {
//         System.out.println("Tiger jumps very long");
//     }
// }
// class Monkey extends Animal
// {

//     void eat ()
//     {
//         System.out.println("Monkey brings and eat");
//     }
//     void sleep ()
//     {
//         System.out.println("Monkey sleeps");
//     }
// }



// public class Hello 
// {
//     public static void main(String[] args) 
//     {
//         Animal ref1 = new Tiger();
//         Animal ref2 = new Monkey();

//         ref1.eat();
//         ref1.sleep();
//         ((Tiger)ref1).jump();  //needed to downcast as we are accessing the specialized method of the child class

//         ref2.eat();
//         ref2.sleep();

//     }
    
// }


// ----------------------------------------------------------------------------------------------------------------




//EXAMPLE 5 (FINAL KEYWORD) POLYMORPHISM


    // class Animal   //shows error as final class not possible in polymorphism
    // {
    //     final void eat ()
    //     {
    //         System.out.println("eat");
    //     }
        
    //     final void sleep ()
    //     {
    //         System.out.println("sleep");
    //     }
        
    // }
    // class Tiger extends Animal
    // {
    
    //     final int age =20;  
    //     void eat ()
    //     {
    //         age = 30;        //cannot override final variable
    //         System.out.println("Tiger hunts and eat");  //cannot override final method
    //         System.out.println(age);
    //     }
    //     void sleep ()
    //     {
    //         System.out.println("Tiger sleeps");
    //     }
    //     void jump ()
    //     {
    //         System.out.println("Tiger jumps very long");
    //     }
    // }
    // class Monkey extends Animal
    // {
    
    //     void eat ()
    //     {
    //         System.out.println("Monkey brings and eat");
    //     }
    //     void sleep ()
    //     {
    //         System.out.println("Monkey sleeps");
    //     }
    // }
    
    
    
    // public class Hello 
    // {
    //     public static void main(String[] args) 
    //     {
    //         Animal ref1 = new Tiger();
    //         Animal ref2 = new Monkey();
    
    //         ref1.eat();
    //         ref1.sleep();
    //         ((Tiger)ref1).jump();  //needed to downcast as we are accessing the specialized method of the child class
    
    //         ref2.eat();
    //         ref2.sleep();
    
    //     }
        
    // }
    
    

    // ----------------------------------------------------------------------------------------------------------------