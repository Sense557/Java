package Lecture;//import java.util.*;

//  🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴------PROOF OF STATIC DEMONSTRATION 1ST------------🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴🚴
//  PROOF OF STATIC DEMONSTRATION 1ST

public class StaticKeyword {
    static int age;    //1st


    static{   //2nd
        age = 18;
        System.out.println("Static block pehle");
        System.out.println(age);
    }

    static void disp1(){   //3rd
        System.out.println("Jab Hum call karenge");
    }
    void disp2(){   //4th
        System.out.println("Jab Hum call karenge");
    }

    public static void main(String[] args) {
        System.out.println("Main Block badme");   //5th
        disp1();

    }
}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️





////  🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡-----------STATIC---------------🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡
////  WHY IT IS USED
////  WHAT IS STATIC MEANS
//
//class Scholar
//{
//    static int age;
//    static  String name;
//    static void details ()
//    {
//        System.out.println("I am static");
//    }
//}
//
//public class Lecture.StaticKeyword {
//
//    public static void main(String[] args) {
//        Scholar.details();
//        System.out.println("Hii");
//
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️





//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//class Demo{
//    static int age;
//
//    void disp1(){
//        System.out.println("Me void bala hun bina obj k nahin aaunga " +"Non Static");
//    }
//
//    static void disp2(){
//        System.out.println("mein static bala hun bin obj k b aaunga call karne per "+"Static");
//    }
//}
//public class Lecture.StaticKeyword {
//    public static void main(String[] args) {
//        Demo.disp2();
//        // System.out.println("mein jvm se directed hun mein koi call na karne par b aaunga");
//        Demo obj = new Demo();
//
//        obj.disp1();
//        // obj.disp2();
//
//        Demo.disp2();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️




//  🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱--------STATIC DEMONSTRATION------------🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱
//
//class Demo1{
//    //1st static variable or instance variable
//    static int a;
//    static int b;
//
//    int m;  //3rd non-static variable
//    int n;
//
//    static{  //2nd Static block
//        a=10;
//        b=15;
//        System.out.println("Control in static block");
//    }
//
//    { //4th non-static block are the blocks with no identifiers
//        m=100;
//        n=200;
//        System.out.println("Control in non-static block");
//    }
//
//    static void disp1(){      //5th static method
//        System.out.println("static value var "+a);
//        System.out.println("static value var "+b);
//    }
//
//    void disp2(){            //6th non static method
//        System.out.println("value of instance var "+m);
//        System.out.println("value of instance var "+n);
//    }
//}
//
//
//public class Lecture.StaticKeyword {
//    public static void main(String[] args) {
//
//        Demo1 obj = new Demo1();
//        Demo1.disp1();
//        obj.disp2();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️







//  🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃----------LOAN CALCULATOR APP--------------🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃
//  LOAN CALCULATOR APP

//class Farmer
//{
//    int p;
//    float t;
//    static float r;
//    float si;
//
//
//    static
//    {
//        r = 8.5f;
//    }
//
//    void input()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the loan amount: ");
//        p = sc.nextInt();
//        System.out.println("Please mention time duration: ");
//        t = sc.nextFloat();
//
//    }
//    void compute()
//    {
//        si= (p*t*t)/100;
//    }
//    void disp()
//    {
//        System.out.println("Your Simple interest will be: "+si);
//    }
//}
//public class Lecture.StaticKeyword
//{
//    public static void main(String[] args)
//    {
//
//        Farmer obj1 = new Farmer();
//        obj1.input();
//        obj1.compute();
//        obj1.disp();
//
//        Farmer obj2 = new Farmer();
//        obj2.input();
//        obj2.compute();
//        obj2.disp();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
