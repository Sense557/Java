package PRACTICE;

class Example1
{
    static int age;

    static
    {
        System.out.println("Pehle mein to prove that i am static--- (2nd) from CLASS");
    }
    static
    {
        age = 33;
    }
    static void show()
    {
        System.out.println(age);
    }
    void show1()
    {
        System.out.println(age);
    }
}

public class Launch1 
{
    static int rollNo;
    static String name;
    static int n;

    static
    {
        System.out.println("Mein tera b baap hoon---- (1st) from Public class");
    }
    static
    {
        rollNo = 21;
        name = "Alok";
        n = 100;
    }
    static void disp()
    {
        System.out.println(name);
        System.out.println(rollNo);
    }
    void disp1()
    {
        // System.out.println(name);
        System.out.println(n);
    }

    public static void main(String[] args) {
        
        Example1.show(); //static this is why we no need to create an obj for it
        Example1 obj = new Example1();   //non - static this is why we need to build obj for it
        obj.show1();                    //ans call the method


        Launch1.disp();      //static
        Launch1 obj1 = new Launch1();  //Non-staic this is why obj
        obj1.disp1();                 //Non-static
        System.out.println("Main method last mein------(Last) from main method() "); //main
    }
}
