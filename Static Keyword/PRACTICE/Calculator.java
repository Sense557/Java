package PRACTICE;


class App
{
    static int a;
    static int b;

    int m;
    int n;
    
    static
    {
        System.out.println("from a static block");
    }

    {
        m = 300;
        n = 500;
        System.out.println("from a non static block");
    }
    static void add(int a, int b)
    {
        a = 30*5;
        b = 20*5;
        System.out.println("from a static method"+(a+b));
        // System.out.println(m);
    }
    void add1()
    {
        System.out.println("from a non-Static method control"+m);
        System.out.println("from a non-Static method control"+n);
        System.out.println(a);
    }
}
public class Calculator {
    public static void main(String[] args) {
        App.add(3,2);
        App obj = new App();
        obj.add1(); 
        
        System.out.println("Last me main method");
        
    }
}
