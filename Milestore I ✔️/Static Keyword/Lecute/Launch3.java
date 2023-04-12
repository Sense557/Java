package STATIC;

class Demo{
    static int age;

    void disp1(){
        System.out.println("Me void bala hun bina obj k nahin aaunga " +"Non Static");
    }

    static void disp2(){
        System.out.println("mein static bala hun bin obj k b aaunga call karne per "+"Static");
    }
}
public class Launch3 {
    public static void main(String[] args) {
        // System.out.println("mein jvm se directed hun mein koi call na karne par b aaunga");
        Demo obj = new Demo();

        obj.disp1();
        // obj.disp2();

        Demo.disp2();
    }
}
