package PRACTICE;

/**
 * Demo
 */
public class Demo {


    static int age;
    static String name;

    static
    {
        age =18;
        System.out.println("static class pehele first ");
        System.out.println(age);
    }
    static void disp()
    {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Demo.age = 50;
        Demo.disp();
        System.out.println("Main class badme after static");

        

    }
}