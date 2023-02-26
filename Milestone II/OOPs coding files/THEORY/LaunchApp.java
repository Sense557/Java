//import java.util.Scanner;
//
///**
// * LaunchApp
// */
//class Rectangle
//{
//    float length;
//    float breadth;
//    float area;
//
//    void input()
//    {
//        System.out.println("Area Calculation of Rectangle App");
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the length of the Rectangle: ");
//        length = sc.nextFloat();
//        System.out.println("Enter the breadth of the Rectangle: ");
//        breadth = sc.nextFloat();
//
//    }
//    void compute ()
//    {
//        area = length*breadth;
//
//    }
//    void show()
//    {
//        System.out.println("The area of the Rectangle is: "+area);
//
//    }
//}
//
//
//class Square
//{
//    float length;
//    float area;
//
//    void input()
//    {
//        System.out.println("Area Calculation of Squrare App");
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the length of the Squrare: ");
//        length = sc.nextFloat();
//
//
//    }
//    void compute ()
//    {
//        area = length*length;
//
//    }
//    void show()
//    {
//        System.out.println("The area of the Square is: "+area);
//
//    }
//}
//
//
//
//
//class circle
//{
//    float radius;
//    float area;
//    float pie;
//
//    void input()
//    {
//        System.out.println("Area Calculation of circle App");
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the radius of the circle: ");
//        radius = sc.nextFloat();
//
//
//        pie = 3.141f;
//
//
//    }
//    void compute ()
//    {
//        area = pie*(radius*radius);
//
//    }
//    void show()
//    {
//        System.out.println("The area of the circle is: "+area);
//
//    }
//}
//
//
//
//
//public class LaunchApp
//{
//
//    public static void main(String[] args)
//    {
//        Rectangle rec = new Rectangle();
//        rec.input();
//        rec.compute();
//        rec.show();
//
//        Square sqr = new Square();
//        sqr.input();
//        sqr.compute();
//        sqr.show();
//
//        circle cir = new circle();
//        cir.input();
//        cir.compute();
//        cir.show();
//
//    }
//}