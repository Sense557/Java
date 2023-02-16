
import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter String 1");
        // String str1 = sc.nextLine();
        // System.out.println("Enter String 2");
        // String str2 = sc.nextLine();


        //Given Strings
        String str1 = "keep";
        String str2 = "peek";

        //converting String to charArray
        char ar1 [] = str1.toCharArray();
        char ar2 [] = str2.toCharArray();

        //Sorting
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        //comparing whether all the elements present in ar1 and ar2 equal
        //if Y - Anagram
        //if N - Not an Anagram
        
        if(Arrays.equals(ar1, ar2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }
        // sc.close();
    }
}
