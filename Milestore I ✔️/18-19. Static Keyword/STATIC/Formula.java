package STATIC;

import java.util.Scanner;

class Rectangle{

    float l;
    float b;
    float perimeter;
    float area;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        l = sc.nextFloat();
        System.out.println("Enter breadth of the rectangle: ");
        b = sc.nextFloat();
        sc.close();

    }

    void calcPerimeter(){
        perimeter = 2*(l+b);
    }

    void calcArea(){
        area = l*b;
    }
    void display1(){
        System.out.println("Perimeter of the rectangle is: "+perimeter);

    }
    void display2(){
        System.out.println("Area of the rectangle is: "+area);
    }

}


public class Formula {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.input();
        obj1.calcPerimeter();
        obj1.display1();

        Rectangle obj2 = new Rectangle();
        obj2.input();
        obj2.calcArea();
        obj2.display2();

        
        
    }
    
    
}
