package Lecture;
//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗-----DEFAULT CONSTRUCTOR-----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//  WHAT IS DEFAULT CONSTRUCTOR
//  WHEN IT CAME TO EXISTENCE AND WHEN NOT
//class  Lecture.Student1
//{
//    private String name;
//    private int age;
//
//    Lecture.Student1()
//    {
//        System.out.println("Hello I am a default constructor");
//    }
//    void show()
//    {
//        System.out.println(name+" "+age);
//    }
//}
//
//public class Lecture.Constructor {
//    public static void main(String[] args) {
//        Lecture.Student1 obj = new Lecture.Student1();
//
//        obj.show();
//
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️






//  ✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️------CONSTRUCTOR DECLARATION--------️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️
//  WHAT IS CONSTRUCTOR OVERLOADING
//  WHAT IS A CONSTRUCTOR
//  WHAT IS ITS NEED


//class  Lecture.Student1
//{
//    private String name;
//    private int age;
//
//    Lecture.Student1(String name, int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//    Lecture.Student1(int age)
//    {
//        this.age = age;
//    }
//    void show()
//    {
//        System.out.println(name+" "+age);
//    }
//}
//
//public class Lecture.Constructor {
//    public static void main(String[] args) {
//        Lecture.Student1 obj = new Lecture.Student1("Shakti",20);
//        obj.show();
//
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️






//  🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟----------CONSTRUCTOR OVERLOADING------------🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
//  CONSTRUCTOR OVERLOADING

class Student1{
    private String name;
    private int age;

    Student1(){
        System.out.println("This is default constructor called");
        name = "Rohan";
        age = 18;
    }
    Student1(String name){
        this.name = name;
        age = 19;
    }
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor {

    public static void main(String[] args) {
        Student1 stud1 = new Student1();
        stud1.disp();

        Student1 stud2 = new Student1("Rahul");
        stud2.disp();

        Student1 stud3 = new Student1("Rohit", 19);
        stud3.disp();
    }
}