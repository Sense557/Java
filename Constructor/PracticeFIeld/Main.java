package PracticeFIeld;

class Constructor{
    private String name;
    private int a;
    private int b;

    //construxtor overloading or constructor chaining
    Constructor()
    {
        
        System.out.println("This is default constructor called");
    }
    Constructor(String name)
    {
        this();
        this.name = name;
    }
    Constructor(int a, int b)
    {
        // this();
        this.a = a;
        this.b = b;
    }

    //How can u use getter instead of method and maintain the code for a long time(i.e. easy to edit)
    String getName()
    {
        return name;
    }
    // void disp1()
    // {
    //     System.out.println(name);
    // }

    // void disp()
    // {
        
    //     System.out.println(a);
    //     System.out.println(b);
    // }
}


public class Main {
    public static void main(String[] args) {
        Constructor obj = new Constructor("Rahul");
        System.out.println(obj.getName());
        // obj.disp1();
        // obj.disp();
        

        // Constructor obj1 = new Constructor();
        // obj1.disp1();

        // Constructor obj2 = new Constructor("Ashish");
        // obj2.disp1();

        
        
    }
}