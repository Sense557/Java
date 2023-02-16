/**
 * MoreOnString
 */
public class MoreOnString {

    public static void main(String[] args) {

        //1ST Example
        // String s1 = "PW Skills";
        // String s2 = new String("PW Skills");

        // System.out.println(s1==s2);  //false
        // System.out.println(s1.equals(s2));  //true



        //2nd Example
        // String s1 = "PW Skills";
        // String s2 = "PW Skills";
        // String s3 = "PW SKILLS";

        // System.out.println(s1==s2);  //true
        // System.out.println(s1==s3);  //false
        // System.out.println(s1.equals(s2));  //true
        // System.out.println(s1.equals(s3));  //false






        //3rd Example
        String s1 = "PW Skills";
        String s2 = new String("PW Skills");
        String s3 = new String("PW SKILLS");

        System.out.println(s1==s2);  //false
        System.out.println(s2==s3);  //false
        System.out.println(s1.equals(s2));  //true
        System.out.println(s2.equals(s3));  //false
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s2.equalsIgnoreCase(s3));//true
    }
}