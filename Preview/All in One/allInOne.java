
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕
/**
 * Encapsulation
 *      -Data hiding + Data Abstraction
 *
 */
//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕


///**
// *  Normal class building and object creation
// */
//
//class Student
//{
//    String name;
//    int age;
//
//    void show()
//    {
//        System.out.println(name+" "+age);
//    }
//}
//
//
//public class allInOne {
//    public static void main(String[] args) {
//
//        Student obj = new Student();
//        obj.show();
//
//    }
//}


//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕

/**
 *  Object Creation
 *  Pass value
 */

class Student
{
    String name;
    int age;
    void setDetails(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void show(String name, int age)
    {
        System.out.println(name+" "+age);
    }
}


public class allInOne {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.show("Alok",25);

    }
}

//🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕