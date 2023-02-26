package Lecture;


//🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟---------AUTOMATIC PROMOTION-----------------🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟

import java.util.*;
class Calc
 {
     public void show(byte n)
     {
         System.out.println("byte "+ n);
     }
     public void show(Short n)
     {
         System.out.println("short "+ n);
     }
     public void show(char n)
     {
         System.out.println("char "+ n);
     }
     public void show(int n)
     {
         System.out.println("int "+ n);
     }
     public void show(long n)
     {
         System.out.println("long "+ n);
     }
     public void show(float n)
     {
         System.out.println("float "+ n);
     }
     public void show(double n)
     {
         System.out.println("double "+ n);
     }
 }
//public class Lecture.OOPsFundamentals {
//    public static void main(String[] args) {


//          Calc obj = new Calc();
//          obj.show(1);

//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter a data: ");
//
//
//          Calc obj = new Calc();
//          obj.show(sc.nextByte());
//          obj.show(sc.nextShort());
//          obj.show(sc.nextInt());
//
//          obj.show(sc.nextLong());
//          obj.show(sc.nextFloat());
//          obj.show(sc.nextDouble());
//          obj.show(sc.nextDouble());

//         Calc obj = new Calc();
//         obj.show('p');

//         sc.close();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️






//🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡------STATIC, INSTANCE & LOCAL VARIABLES--------------🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡🪡
public class OOPsFundamentals {
//     ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//    Static variables-----------
//    Static variables are declared with the keyword "static" and are typically defined within a function or a class.
//    When a static variable is defined within a function, it can only be accessed within that function.
//    When a static variable is defined within a class, it can be accessed by any member function of the class.
//    It's important to note that static variables have a global lifetime, which means they remain in memory until the program ends.
//    This can lead to potential memory issues if static variables are not used carefully.
//    It has also default values
//    Only local variables has no default values

    static int age;  //0
    static String surname;   //null

//     🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
//    Instance variables---------------
//    Instance variables should be declared within the class directly
//    But outside any method or block or constructor
//    without the keyword static

    byte b;   //instance variable have default value 0
    short s;  //instance variable have default value 0
    char ch;   //instance variable have default value
    int i;  //instance variable have default value 0
    long l;   //instance variable have default value 0.0
    float f;   //instance variable have default value 0
    double d;   //instance variable have default value 0.0
    String name;   //instance variable //have default value null

    void defau()
    {
        System.out.println("byte: "+b);
        System.out.println("short: " +s);
        System.out.println("char: " +ch);
        System.out.println("int: " +i);
        System.out.println("long: " +l);
        System.out.println("float: " +f);
        System.out.println("double: "+d);
        System.out.println("String: " +name);
    }

    public static void main(String[] args) {

//         👌👌👌👌👌👌👌👌👌👌👌👌
//        static variables call
//         System.out.println("Static default variables: "+age);
//         System.out.println("Static default variables: "+surname);


//        🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏
//        Instance variables example call
//         Lecture.OOPsFundamentals obj = new Lecture.OOPsFundamentals();
//         obj.defau();


//         ✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
//        local variables example call
//         int age; //Local variable have no default values we have to initialize it manually
//         System.out.println(age);

//     private void num() {
//         int a =5;
//         System.out.println(a);
     }
}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️