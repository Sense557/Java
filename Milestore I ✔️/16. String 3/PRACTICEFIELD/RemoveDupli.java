import java.util.Scanner;

/**
 * RemoveDupli
 */
public class RemoveDupli {
    static String removingDupli(String s)
    {
        boolean charSet [] = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
        if (!charSet[ch]) 
        {
            charSet[ch] = true;
            sb.append(ch);
        }
    }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("after revoing the duplicates: "+removingDupli(s));
        sc.close();
    }
}