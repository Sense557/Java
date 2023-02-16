

// import java.util.Scanner;

public class Pangram
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string");
        // String str = sc.nextLine();

        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        str = str.replace(" ", "");
        str = str.toUpperCase();
        // char ch []= str.toCharArray();
        int ar [] = new int[26];

        for(int i = 0; i<str.length(); i++)
        {
            ar[str.charAt(i)-65]++;
        }
        for(int i =0; i<ar.length; i++)
        {
            if(ar[i]==0)
            {
                System.out.println("The String is Not a Pangram");
                flag = true;
            }
        }
        if(flag == false)
            System.out.println("The String is a Pangram");

            // sc.close();

    }
}
