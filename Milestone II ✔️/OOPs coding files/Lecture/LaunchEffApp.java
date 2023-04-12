//import java.util.*;
//
//abstract class Shape
//{
//    float area;
//
//    abstract void input();
//    abstract void compute();
//    public void show()
//    {
//        System.out.println("The area is: "+ area);
//    }
//
//
//}
//class Rectangle1 extends Shape
//{
//    float length;
//    float breadth;
//
//    public void input()
//    {
//        System.out.println("Area Calculation of Rectangle App");
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the length of the Rectangle: ");
//        length = sc.nextFloat();
//        System.out.println("Enter the breadth of the Rectangle: ");
//        breadth = sc.nextFloat();
//
//    }
//    public void compute ()
//    {
//        area = length*breadth;
//    }
//}
//
//class Square1 extends Shape
//{
//    float length;
//
//    public void input()
//    {
//        System.out.println("Area Calculation of Squrare App");
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the length of the Squrare: ");
//        length = sc.nextFloat();
//    }
//    public void compute ()
//    {
//        area = length*length;
//    }
//
//}
//
//
//class circle1 extends Shape
//{
//    float radius;
//    float pie;
//
//    public void input()
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
//    public void compute ()
//    {
//        area = pie*(radius*radius);
//
//    }
//
//}
//class Geometry
//{
//    public void poly(Shape ref)
//    {
//        ref.input();
//        ref.compute();
//        ref.show();
//    }
//}
//
//
//
//
//
//public class LaunchEffApp
//{
//    public static void main(String[] args)
//    {
//        Rectangle1 rec = new Rectangle1();
//        Square1 sq = new Square1();
//        circle1 c = new circle1();
//
//        Geometry g = new Geometry();
//        g.poly(rec);
//        g.poly(sq);
//        g.poly(c);
//    }
//}
