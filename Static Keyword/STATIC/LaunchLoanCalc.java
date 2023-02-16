package STATIC;

import java.util.Scanner;

class Consumer{

    int Principal;
    float time;
    static float rate;
    float simpleRateOfI;

    static
    {
        rate = 7.5f;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan Amount: ");
        Principal = sc.nextInt();
        System.out.println("Enter Time Duration in yrs: ");
        time = sc.nextFloat();
        sc.close();   
    }
    void calculate(){
        simpleRateOfI = (Principal*time*rate)/100;
    }
    void display(){
        System.out.println("Simple rate of interest: "+simpleRateOfI);
    }
}



public class LaunchLoanCalc {
    public static void main(String[] args) {
        Consumer object1 = new Consumer();
        object1.input();
        object1.calculate();
        object1.display();

        Consumer object2 = new Consumer();
        object2.input();
        object2.calculate();
        object2.display();
        
    }
}
