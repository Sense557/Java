package Lecture;
/**
 * Launch4
 */
public class Launch4 {

    public static void main(String[] args) {

        //1st example of Concatination of the two string
        String s1 = "pw";
        s1.concat("skill");

        System.out.println(s1); //pw



        //Practice the 1st Example
        // String s1= "Police";
        // String s2 = "Station";
        // // String s3= "Great";

        // s1.concat("Great"); //not saving this String in a new one so this will not affect anything
        // System.out.println(s1+s2); //Police Station
        // System.out.println(s1.concat(s2)); //Police Station
        // System.out.println(s2.concat(s1)); //Station Police


        //2nd example
        //Here never get confused that String is mutable now
        //NO
        //String is immutable 
        //It all happened because here s1 new string is created 
        //and copying and adding the same value at a time
        // s1 = s1.concat("skill"); // so to save and print use this technique
        // System.out.println(s1);

    }
}