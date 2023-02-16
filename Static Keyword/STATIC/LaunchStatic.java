package STATIC;

public class LaunchStatic {
    static int age;


    static{
        age = 18;
        System.out.println("Static block pehle");
        System.out.println(age);
    }

    static void disp(){
        System.out.println("Jab Hum call karenge");
    }
    public static void main(String[] args) {
        System.out.println("Main Block badme");
        disp();
        
    }
}
