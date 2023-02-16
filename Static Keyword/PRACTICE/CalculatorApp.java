package PRACTICE;

import java.util.Scanner;

class Farmer
{
    int p;
    float t;
    static float r;
    float si;

    static
    {
        r = 7.8f;
    }
    

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your loan amount");
        p = sc.nextInt();
        System.out.println("Enter the time period in Year");
        t = sc.nextFloat();
        

        sc.close();
    }
    void calc()
    {
        si = (p*t*r)/100f;
        
    }
    void show()
    {
        System.out.println("Your Simple interest is: "+si);
    }
}
public class CalculatorApp 
{
    public static void main(String[] args) 
    {
        Farmer obj = new Farmer();
        obj.input();
        obj.calc();
        obj.show();
        
    }
}
