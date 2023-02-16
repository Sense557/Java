package THEORY;


class Demo{
    private int a;
    private int b;

    Demo()
    {
        System.out.println(" ");
        System.out.println("Zero Parameterized constructor is assigned by Programmer ");
    }

    Demo(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}


public class MoreOnConstructor {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.disp();
        // d.add();

        Demo d2 = new Demo(10,20);
        d2.disp();
        
    }
}