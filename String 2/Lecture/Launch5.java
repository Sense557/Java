package Lecture;
public class Launch5 {
    public static void main(String[] args) {

        //1st example (Using Concat method)
        // String s1 = "pwjava";
        // String s2 = s1.concat("skills");
        // String s3 = new String("pwjava");
        // s3 = s3.concat("skills");

        // System.out.println(s1); //pwjava
        // System.out.println(s2); //pwjavaskills
        // System.out.println(s3); //pwjavaskills



        //2nd Example (Using + operator)
        // String s1 = "pw";
        // String s2 = "pw"+"java";
        // String s3 = "pw"+"java"+"skills";
        // String s4 = s1+s2;

        // System.out.println(s1); //pw
        // System.out.println(s2); //pwjava
        // System.out.println(s3); //pwjavaskills
        // System.out.println(s4); //pwpwjava




        //3rd Example (adding integers in a string as well)
        // String str = "pw"+100+90;
        // System.out.println(str);

        // String str = "pw"+130+60;
        // System.out.println(str);



        //4th Example (Explaining more about the concat method and its disadvantages)
        //it will show error
        //as concat cannot add int value in it
        //this is why showing error
        // String str = "pw";
        // s1 = str.concat(100);
        // System.out.println(s1);

        String str = "Radheshyam";
        String s = str.concat(" awesome");
        System.out.println(s);

        
        
    }
}
