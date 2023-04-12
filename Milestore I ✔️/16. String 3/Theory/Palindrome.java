

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();

        //String str1 = "2552";
        String str2 = "";

        for(int i=str1.length()-1; i>=0; i--)
        {
            str2 += str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            System.out.println(str1+" is a Palindrome");
        }
        else
        {
            System.out.println(str2+ " isnot a Palindrome");
        }
        sc.close();
    }
}
