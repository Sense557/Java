package Lecture;//
//
////  👌👌👌👌👌👌👌👌👌👌👌----------------------REVISION 1---------------👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌
////  PRINTING DEFAULT VALUES OF THE OBJECT
//class Lecture.Student
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
//public class Lecture.Encapsulation {
//    public static void main(String[] args) {
//        Lecture.Student obj = new Lecture.Student();
//        obj.show();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️️〰️〰️〰️〰️〰️〰️〰️️〰️〰️〰️〰️〰️〰️〰️️






//  👌👌👌👌👌👌👌👌👌👌👌----------------------REVISION 2---------------👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌
//  PRINTING DEFAULT VALUES OF THE OBJECT
//
//class Lecture.Student
//{
//    String name;
//    int age;
//
//    void setData()
//    {
//        name = "Amar";
//        age = 25;
//    }
//    void show()
//    {
//        System.out.println(name+" "+age);
//    }
//}
//
//public class Lecture.Encapsulation {
//    public static void main(String[] args) {
//        Lecture.Student obj = new Lecture.Student();
//        obj.setData();
//        obj.show();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️️〰️〰️〰️〰️〰️〰️〰️️〰️〰️〰️〰️〰️〰️〰️️





////    👌👌👌👌👌👌👌👌👌👌👌----------------------REVISION 3---------------👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌
////     HOW TO PRINT THE PRESET VALUES OF THE OBJECT
////
//class Lecture.Student
//{
//    String name;
//    int age;
//    void name()
//    {
//        name = "Amar";
//    }
//    void age()
//    {
//        age = 25;
//    }
//
//    void show()
//    {
//        System.out.println(name+" "+age);
//    }
//}
//
//public class Lecture.Encapsulation {
//    public static void main(String[] args) {
//        Lecture.Student obj = new Lecture.Student();
//        obj.name();
//        obj.age();
//        obj.show();
//    }
//}
//
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️️〰️〰️〰️〰️〰️〰️〰️️〰️〰️〰️〰️〰️〰️〰️️





//        👌👌👌👌👌👌👌👌👌👌👌----------------------REVISION 4---------------👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌
//         HOW TO PASS THE DESIRED VALUES TO THE OBJECTS
//
//    class  Lecture.Student
//{
//
//    String name;
//    int age;
//    String name(String name)
//    {
//        name = "Amar";
//        return name;
//    }
//    int age(int age)
//    {
//        age = 25;
//        return age;
//    }
//
//    void show()
//    {
//        System.out.println(name+" "+age);
//    }
//}
//
//public class Lecture.Encapsulation {
//    public static void main(String[] args) {
//        Lecture.Student obj = new Lecture.Student();
//        obj.age = 50;
//        obj.name = "Amar";
//        obj.show();
//    }
//
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
//





////🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟____NOTES_______🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
//// Lecture.Encapsulation ------->
////     is one of the fundamental concepts in object-oriented programming and is an important aspect of the
////     Java programming language. It refers to the practice of hiding the implementation details of an object and providing
////     a well-defined interface for interacting with the object.
////
////        In Java, encapsulation is achieved through the use of access modifiers, which control the visibility of
////        classes,methods, and variables. By using access modifiers, you can specify which parts of a class are
////        visible and accessible to other classes and which parts are hidden and can only be accessed through a defined
////        interface.
////
////            For example, you can use the private access modifier to hide the implementation details of a class from
////            other classes, allowing you to change the implementation without affecting the other parts of your code
////            that use the class. You can then provide public methods that provide a well-defined interface for interacting
////            with the class, without exposing its implementation details. Lecture.Encapsulation has several benefits, including
////            improved code organization, reduced complexity, and increased security. By hiding the implementation
////            details of an object, you can ensure that other parts of your code cannot modify the object in unexpected
////            ways, leading to more robust and reliable software.
////
////🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
////
//
//
//
//
//
//
//        👌👌👌👌👌👌👌👌👌👌👌----------------------REVISION 5---------------👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌
//         HOW TO PROTECT THE DATA TO BE ACCESSES DIRECTLY FROM THE PUBLIC AND WE CAN HAVE ACCESS
//         HOW TO MAKE PRIVATE DATA ACCESSIBLE----(USING SETTER & GETTER METHOD)
//         WHAT IS SHADOWING PROBLEM------->
//                  [In Java, the term "shadowing" generally refers to a situation where a variable declared within
//                  a local scope has the same name as a variable declared in an outer scope. When this happens,
//                  the inner variable "shadows" the outer variable, making it inaccessible within the local scope.]
////
    class  Student
{

    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name)
    {
         this.name = name;
    }

    public String getName()
    {
        return name;
    }

    void show()
    {
        System.out.println(name+" "+age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(30);
        obj.getAge();

        obj.setName("Krishna");
        obj.getName();
        obj.show();
    }

}
