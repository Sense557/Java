package STATIC;

import java.util.Scanner;

class Farmer{
    int p;
    float t;
    static float r;
    float si;


    static{
        r = 8.5f;
    }



    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the loan amount: ");
        p = sc.nextInt();
        System.out.println("Please mention time duration: ");
        t = sc.nextFloat();
        sc.close();

    }
    void compute(){
        si= (p*t*t)/100;
    }
    void disp(){
        System.out.println("Your Simple interest will be: "+si);
    }
}



public class LaunchFarmer {
    public static void main(String[] args) {

        Farmer obj1 = new Farmer();
        obj1.input();
        obj1.compute();
        obj1.disp();

        Farmer obj2 = new Farmer();
        obj2.input();
        obj2.compute();
        obj2.disp();
    }
}
