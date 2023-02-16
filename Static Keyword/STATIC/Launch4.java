package STATIC;

class Demo1{   //1st static variable or instance variable
    static int a; 
    static int b;

    int m;  //3rd non-static variable
    int n;

    static{  //2nd Static block
        a=10;
        b=15;
        System.out.println("Control in static block");
    }

    {             //4th non-static block
        m=100;
        n=200;
        System.out.println("Control in non-static block");
    }

    static void disp1(){      //5th static method 
        System.out.println("static value var "+a);
        System.out.println("static value var "+b);
    }

    void disp2(){            //6th non static method
        System.out.println("value of instatce var "+m);
        System.out.println("value of instatce var "+n);
    }
}



public class Launch4 {
    public static void main(String[] args) {

        Demo1 obj = new Demo1();
        Demo1.disp1();
        obj.disp2();


        
    }
    
}
