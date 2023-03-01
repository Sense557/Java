package Practice;

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * What is Inheritance ?
 */

//class Papa          // Parent class//super class
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child extends Papa   //sub class// base class// derived class // inherited class
//{
//
//}
//
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * Types of Inheritance ?  //3
 *      -Single - level
 *      -Multi - Level
 *      -Hierarchical
 *      -Multiple level not allowed ---- solved in interface
 */
//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * SINGLE LEVEL INHERITANCE
 *      (i.e Inheritation happens only one level from parent to one child)
 *      i.e. Parent ---> child 1 only
 */

//class Papa
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child extends Papa
//{
//
//}
//
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * MULTI - LEVEL INHERITANCE
 *      (i.e Inheritation happens from one parent to one child and then from that child to another and then from that to another)
 *      i.e. Parent ---> child 1, Child 1   ---->  Child 2, Child 2 ------> Child 3......etc.
 *      Here child can alo inherit to its child
 */
//
//class Papa
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child1 extends Papa
//{
//
//}
//class Child2 extends Child1
//{
//
//}
//
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Child2 obj = new Child2();
//        obj.show();
//
//    }
//}



//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * HIERARCHICAL - LEVEL INHERITANCE
 *      (i.e Inheritation happens from one parent to Many childs )
 *      i.e. Parent ---> child 1, Parent   ---->  Child 2, Parent ------> Child 3......etc.
 *      But Here only from parent to child
 */

//class Papa
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child1 extends Papa
//{
//
//}
//class Child2 extends Papa
//{
//
//}
//
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Child2 obj = new Child2();
//        obj.show();
//
//    }
//}



//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * MULTIPLE INHERITANCE
 *      (i.e Inheritation happens from one parent to one child and then from that child to another and then from that to another)
 *      i.e. Parent1 ---> child 1,
 *           Parent2 ---> child 1,
 *              Here in the Child 1 all the characters or behaviours or properties of all its parents gathered
 *              which is not happening in real world so it is not possible here also
 *                  - THIS KIND OF PROBLEM IS CALLED DIAMOND SHAPED PROBLEM IN INHERITANCE
 *                      -this problem will be solved in interface only in the next lecture
 *
 *          NOTE--
 *              -जिसका कोई पैरेंट नहीं होता उसका ऑब्जेक्ट क्लास पैरेंट होता हे
 *              -
 */

//class Papa1
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Papa2
//{
//
//}
//class Child extends Papa1,Papa2  // impossible in inheritance
//{
//
//}
//
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Child2 obj = new Child2();
//        obj.show();
//
//    }
//}





//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 * TYPES OF METHODS IN INHERITANCE
 *      -Inherited
 *      -Overriden
 *      -Specialized
 */
//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 * INHERITED METHOD
 */


//class Papa
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child extends Papa
//{
//    //Inherited properties inside it has been copied fromt its parent as it is
//    //although not seen but present as we have use extends keyword
//}
//public class Rough {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
//
//    }
//}

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 * OVERRIDEN METHOD
 */

//
//class Papa
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child extends Papa
//{
//    void show()
//    {
//        System.out.println("My father was showing off I am little bit modified in that");
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();             //modified behaviour of the father reflected in the child
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 * SPECIALIZED METHOD
 */

//
//class Papa
//{
//    void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child extends Papa
//{
//    //overriden method i.e modified character of parent
//    void show()
//    {
//        System.out.println("My father was showing off I am little bit modified in that");
//    }
//}
//
//class Child2 extends Papa
//{
//
//    //specialized method i.e new behaviour developed of its own
//    void earn()
//    {
//        System.out.println("I am earning rather than showing");
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Child2 obj = new Child2();
//        obj.show();             //modified behaviour of the father reflected in the child
//        obj.earn();             //specialized method developed of his own
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  RULES TO OVERRIDE---
 *      1. Never decrease the visibility
 *      2. DataType should be same
 *      3. Parameter should also be same
 *              i.e. otherwise it will consider this as a new method like in method overloading
 *              not giving the error it doesnot mean it is ok it means this is the logic behind
 *
 */

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  PROVING THE RULES TO OVERRIDE
 *      What the rules to be followed during override
 */

//
//class Papa
//{
//     void show()
//    {
//        System.out.println("showing off");
//    }
//}
//class Child extends Papa
//{
//    /**
//     *
//     * reducing the visibility
//     */
////    cannot reduce the visibility i.e access modifiers but we can increase
////    protected void show()
//    void show(int age)
//    {
//        System.out.println("showing off child 1");
//    }
//}
//
//class Child2 extends Papa
//{
//    /**
//     * //    Changing the parameter
//     * //    considering this as the newly developed method as the new method like in method overloading
//     */
//
//    void show()
//    {
//        System.out.println("showing off child 2");
//    }
//}
//class Child3 extends Papa
//{
//    /**
//    //    Changing the data type during overriding
//    //    showing error as we have changed the void show ---> int show method
//     */
//
//    int show()
//    {
//        System.out.println("showing off child 3");
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Child3 obj = new Child3();
//        obj.show();
//
//    }
//}

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * CONSTRUCTOR EXECUTION IN INHERITANCE
 *      Benefits:-
 *          1. We don't need to change the method to call only need to change the parameter in the obj.
 *          2. Only create obj only method calling can be managed from the parameter also
 *          3. One shot two dead trick also applied here --------(ek goli mein do call)-----
 */

//class Papa
//{
//    Papa()
//    {
//        System.out.println("Zero parameterized Constructor from papa");
//    }
//    Papa(int money)
//    {
//        System.out.println(" parameterized Constructor from papa");
//    }
//}
//class Mom extends Papa
//{
//    /**
//     * super(); Hiddenly present in the every zero / default constructor
//     * that indirectly calling the zero parameterized constructor of the parent class
//     * super();
//     */
//    Mom()
//    {
////        super();
//        System.out.println("Zero parameterized Constructor from mom");
//    }
//    Mom(int money)
//    {
//        System.out.println(" parameterized Constructor from mom");
//    }
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//
////        Papa obj = new Papa();
//        Mom obj1 = new Mom();
//
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  ARGUMENT Vs PARAMETER
 *      -Argument ----> during the time of declaring, pass the value
 *      -Parameter  ----> during the time of defining, pass the value
 */

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️









//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  POLYMORPHISM
 *      -What is Polymorphism?
 *          --It is the ability of an object to take many forms or structures
 *          --It is greek word
 *              ---Poly - Many,
 *              ---Morphism -- forms or structures
 *      ----------------------------------------------------------
 *      -How to achieve Polymorphism ?
 *          --using method overloading and overriding
 *      ----------------------------------------------------------
 *      -Types of Polymorphism?
 *          --Static Polymorphism
 *          --Dynamic Polymorphism
 *      ----------------------------------------------------------
 */


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Polymorphism Example 1
 */
//
//class Aeroplane
//{
//    void takeOff()
//    {
//        System.out.println("Aeroplane is takingoff");
//    }
//    void fly()
//    {
//        System.out.println("Aeroplane is flying");
//    }
//}
//class Cargoplane extends Aeroplane
//{
//    void takeOff()
//    {
//        System.out.println("Cargoplane is takingoff");
//    }
//
//    void fly()
//    {
//        System.out.println("Cargoplane is flying");
//    }
//
//}
//class Fighterplane extends Aeroplane
//{
//    void takeOff()
//    {
//        System.out.println("Fighterplane is takingoff");
//    }
//    void fly()
//    {
//        System.out.println("Fighterplane is flying");
//    }
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Cargoplane cp = new Cargoplane();
//        Fighterplane fp = new Fighterplane();
//
//        Aeroplane ref;
//
////        cp = ref;     //it will give error as child class cant handle the properties and behaviours of parent class as reference
////        fp = ref;
//
//        ref = cp;
//        ref.takeOff();
//        ref.fly();
//
//        System.out.println("--------------");
//
//        ref = fp;
//        ref.takeOff();
//        ref.fly();
//
//
//    }
//}

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Polymorphism Example 2
 */
//
//class Aeroplane
//{
//    void takeOff()
//    {
//        System.out.println("Aeroplane is takingoff");
//    }
//    void fly()
//    {
//        System.out.println("Aeroplane is flying");
//    }
//}
//class Cargoplane extends Aeroplane
//{
//    void takeOff()
//    {
//        System.out.println("Cargoplane is takingoff");
//    }
//
//    void fly()
//    {
//        System.out.println("Cargoplane is flying");
//    }
//
//}
//class Fighterplane extends Aeroplane
//{
//    void takeOff()
//    {
//        System.out.println("Fighterplane is takingoff");
//    }
//    void fly()
//    {
//        System.out.println("Fighterplane is flying");
//    }
//}
//
//class Airport
//{
//    public void station(Aeroplane ref)
//    {
//        ref.takeOff();
//        ref.fly();
//    }
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Aeroplane cp = new Cargoplane();
//        Aeroplane fp = new Fighterplane();
//
//        /**
//         *  //       we are applying the polymorphism very deeply giving the parent ref to the childs
//         * //        and therby doing the reduction of code as well
//         */
//
//        Airport ref = new Airport();
//
//        ref.station(cp);
//        ref.station(fp);
//
//
//
//
////        cp = ref;
////        fp = ref;
//
////        ref = cp;
////        ref.takeOff();
////        ref.fly();
////
////        System.out.println("--------------");
////
////        ref = fp;
////        ref.takeOff();
////        ref.fly();
//
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  ABSTRACTION & FINAL KEYWORD
 *
 *  ABSTRACTION
 *
 *      Abstract Keyword---->
 *          -We can use it as a template for the methods
 *          -as no child is using the parent method as it is so why not we provide the template type thing
 *          -to complete their polymorphism
 *
 *          How to achieve 100% abstraction-->
 *  *              -To achieve it we need to use 100% abstract
 *  *              - like only abstract methods in the abstract class
 *  *              - then after that it is possible and this issue has been solved in the interface lecture
 *
 *          Rulse for Abstract-->
 *              -abstract class ✔️
 *              -abstract method ✔️
 *              -abstract variable ❌
 *              -abstract constructor ❌
 *         --------------------------------------------------------------------
 *
 *
 *   FINAL KEYWORD
 *      final Keyword---->
 *          -When we want to mark a variable or method as constant
 *          -and we don't want to change
 *
 *              Rules for final--->
 *                  - final class ❌ (as it can't contain subclass)
 *                  -final variable ✔️ (can't override)
 *                  -final method ✔️   (can't override)
 */
//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 *  ABSTRACT
 */


//abstract class Papa
//{
//    abstract void show();
//    abstract void earn();
//
//}
//class Child extends Papa
//{
//    void show()
//    {
//        System.out.println("showing");
//    }
//    void earn()
//    {
//        System.out.println("earning");
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
//        obj.earn();
//
//    }
//}

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  final Keyword
 */




//final class Papa        //will show error as final class not possible as it has no sub class
//class Papa
//{
//    final int age = 30;
//    final void show()
//    {
//        System.out.println("showing off");
//    }
//
//
//}
//class Child extends Papa
//{
//    void show()               // cannot override
//    {
//        age = 50;              //cannot assign value to final variable error
//        System.out.println("showing");
//    }
//
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
//        obj.earn();
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  COMPOSITION
 *      --a way to add multiple classes into a class to make a complex class object
 *      --Without using the inheritence
 *      --We are trying to build a composite class
 *      -- किसी दूसरे का ऑब्जेक्ट और मेथड लाके एक दूसरे क्लास में जमा करना उसी क्लास के मेथड के रूप में
 *              -- this is called COMPOSITION
 *      -- if we have to create an object and define method that many times then no use of it
 *          -- so we used dependency injection
 */

//
//class Heart
//{
//    void heartBeat()
//    {
//        System.out.println("Heart is Beating");
//    }
//}
//
//class Address
//{
//    void addressDetail()
//    {
//        System.out.println("Address details is telling");
//    }
//}
//class Student
//{
//   void call1()
//   {
//       Heart obj = new Heart();
//       obj.heartBeat();
//   }
//   void call2()
//   {
//       Address obj1 = new Address();
//       obj1.addressDetail();
//   }
//
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Student obj = new Student();
//        obj.call1();
//        obj.call2();
//
//    }
//}



//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  DEPENDENCY INJECTION (CONSTRUCTOR + SETTER)
 *
 *      Advantages over composition-->
 *          -No need to create objects that many time as in COMPOSITION
 *          -Just passing the reference of the dependent class into the target class methods
 *          -Neither Inheritance is used
 *          -Neither Composition is used
 *
 *      Note--->
 *          -Purely Setter and Constructor method used for Dependency Injection
 *
 */

/**
 * CONSTRUCTOR + SETTER
 */

//
//class Student
//{
//    private Heart heart;
//
//    //setter injection
//    public void setHeart(Heart heart)
//    {
//
//        this.heart = heart;
//    }
//
//    //constructor injection
//    public Student(Heart heart)
//    {
//        this.heart = heart;
//    }
//    public void show()
//    {
//        heart.heartBeat();
//    }
//}
//
//class Heart
//{
//
//    void heartBeat()
//    {
//        System.out.println("Heart is Beating");
//    }
//}
//
//
//
//
//public class Rough {
//    public static void main(String[] args) {
//        Heart heart = new Heart();
//        Student obj = new Student(heart);  //CONSTRUCTOR
//
//        obj.setHeart(heart);   //SETTER
//        obj.show();
//
//
//
//    }
//}


//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕

/**
 * CONSTRUCTOR
 */

//
//class Student
//{
//    private Heart heart;
//
//    //setter injection
//
//
//    //constructor injection
//    public Student(Heart heart)
//    {
//        this.heart = heart;
//    }
//    public void show()
//    {
//        heart.heartBeat();
//    }
//}
//class Heart
//{
//    void heartBeat()
//    {
//        System.out.println("Heart is Beating");
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Heart heart = new Heart();
//        Student obj = new Student(heart);  //CONSTRUCTOR
//
//        obj.show();
//
//
//    }
//}


//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
/**
 *      TIGHTLY COUPLED Vs LOOSELY COUPLED
 *
 *          Tightly Coupled:-
 *              -only giving reference to the same class
 *          Loosely Coupled -
 *              -giving reference to the parent class
 */
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕

/**
 *      HYBRID
 *          ---> HIERARCHY + MULTI-LEVEL
 *          ---> OR any type of inheritance combunation is called "Hybrid".
 *
 */
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
/**
 *      Note--
 *          - Java class can-----> implement multiple interfaces
 *          - But, Java class cannot ----> extends multiple classes
 */
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕---------INTERFACE-------------🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕--------LAMBDA EXPRESSION------🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕

/**
 * NITERFACE
 *
 *      What is interface?
 *          -a way to implement multiple classes int to one class
 *
 *      Rules-
 *          -requirement specification
 *          -Object creation not allowed
 *              --then how can we call an object
 *                  -- we can do it by implementing it in a class and calling that class
 *          -variable--> by default -- public static final
 *          -method--> by default -- public abstract
 *          -modifiers --> restriction -- public
 *              -i.e. except all modifiers not allowed
 *          -constructors -- cannot be used
 *          -only abstract methods allowed
 *
 *      What is the need of interface?
 *          -we can implement multiple classes
 *          -i.e. what is not possible in inheritance
 *          -as we have discusses multiple inheritance not possible
 *          -that issue is going to be solved in this interface concept
 *
 *      Implementation of interface?
 *          -use keyword  "implements"
 *
 */
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕

/**
 *   What is interface?
 *            -a way to implement multiple classes int to one class
 *


 //interface A
 ////method cannot have body as it is public abstract by default
 //
 //{
 //    int num = 30;
 //    void show ();
 //}
 //class B implements A
 //{
 //    //so we need to mention this method as public as it is implemented as public
 //    //else show visibility issues
 //    public void show()
 //    {
 //        System.out.println("showing");
 //    }
 //}
 //
 //public class Rough
 //{
 //    public static void main(String[] args) {
 ////        cannot be instantiated
 ////        A obj = new A();
 ////        obj.show();
 //
 //        System.out.println(A.num);
 //
 ////
 //    }
 //}

 //🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
 /**
 *    Why Need of Interface
 *
 *          Example for what is the need of Interface demonstration
 */

class Computer
{
    void compileCode()
    {

    }
}

class Laptop extends Computer
{
    void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}
class Desktop extends Computer
{
    void compileCode()
    {
        System.out.println("You got 5 errors, faster");
    }
}

class Developer
{

//    void buildApp(Laptop laptop)
//    void buildApp(Desktop desktop)
    void buildApp(Computer computer)
    {
        System.out.println("Building an App");
//        laptop.compileCode();
//        desktop.compileCode();
        computer.compileCode();
    }

}

public class Rough
{
    public static void main(String[] args) {
//        Laptop laptop = new Laptop();
//        Desktop desktop = new Desktop();
        Computer computer = new Computer();
        Developer dev = new Developer();
//        dev.buildApp(laptop);
//        dev.buildApp(desktop);
        dev.buildApp(computer);
    }
}

//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕

/**
 *  Implementation of Interface
 *
 *   Condition ---
 *       -If we have to mention a class and create an obj for it then
 *       -what is the use of creating interface for it
 *       --will get clarity in the next lecture
 *
 */
//
//interface A
////method cannot have body as it is public abstract by default
//
//{
//    int num = 30;
//    void show ();
//}
//class B implements A
//{
//    //so we need to mention this method as public as it is implemented as public
//    //else show visibility issues
//    public void show()
//    {
//        System.out.println("showing");
//    }
//}
//
//public class Rough
//{
//    public static void main(String[] args) {
////        cannot be instantiated
////        and it has no value only contain abstract no body this why showing error
////        A obj = new A();
////        obj.show();
//
//        System.out.println(A.num);
//
////        can be called ok as it contains implementation of A interface
//        B obj = new B();
//        obj.show();
//    }
//}