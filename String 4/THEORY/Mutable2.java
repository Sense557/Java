package THEORY;
public class Mutable2 {
    public static void main(String[] args) {
        //😎😎😎😎😎😎After declaring final int it is giving error
        //As it is now acting as constant after using final 

        // final int a = 10;
        //     a = 20; //20
        // System.out.println(a);



        //🍚🍚🍚🍚🍚How can we add any data to a StringBuilder Example
        //This is why StringBuilder is Mutable

        // StringBuffer sb = new StringBuffer("Virat");
        // sb.append("Kohli");
        
        // // System.out.println(sb);  //Kohli
        // sb = new StringBuffer("Sachin");  
        // System.out.println(sb);    //Sachin



        //🍿🍿🍿🍿What if i use final in a StringBuilder 
        //Simply it is not making it immutable 
        //just changing its references
        // final StringBuffer sb = new StringBuffer("Virat");
        // sb.append("Kohli");
        // // System.out.println(sb);  //ViratKohli
        // sb = new StringBuffer("Sachin"); //Showing error it is coz it is now referring sb which is now final
        // System.out.println(sb);
    }
}
