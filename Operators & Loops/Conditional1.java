
public class Conditional1 {
    public static void main(String[] args) {
        // int age =19;

        // if(age >=18){
        //     System.out.println("You are an adult");
        // }
        // else
        //     System.out.println("You are a child");


        // int age = 50;

        // if(age >=18 && age <60){
        //     System.out.println("You are an adult");
        // }
        // else if(age >= 60){
        //     System.out.println("You are an old man");
        // }
        // else
        //     System.out.println("You are a child");




        int age = 19;

        if(age >=18 && age < 60){
            if (age >= 18 && age <30) {
                System.out.println("You are in 20's");
            }else if (age >= 30 && age <40) {
                System.out.println("You are in 30's");
            }else if (age >=40 && age <50) {
                System.out.println("You are in 40's");
            }else
                System.out.println("You are not old enough to get retired");

        }
        else if(age >= 60){
            if (age >= 60 && age <70) {
                System.out.println("You are in 60's");
            }else if (age >= 70 && age <80) {
                System.out.println("You are in 70's");
            }else
                System.out.println("You are very old and your name is going to be in gunius book record");
        }
        else if (age <18 && age > 12) {
            System.out.println("You are now teen");
        }
        else 
            System.out.println("You are just born");
    }
}
