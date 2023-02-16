// import java.util.Arrays;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {

        //⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
        // //checking a palindrome

        // String str1 = "2552";
        // String str2 = "";

        // //traversing the string in the reverse direction
        // for(int i=str1.length()-1; i>=0; i--){
        //     str2 += str1.charAt(i);
        // }
        // //comparing the two strings
        // if(str1.equals(str2)){
        //     System.out.println("Palindrome");
        // }
        // else
        //     System.out.println("Not a palindrome");





        //⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
        //pangram
        
        // boolean flag = false;
        // String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        // s = s.replace(" ", "");
        // s = s.toUpperCase();

        // int arr [] = new int [26];

        // //traverse through the original array
        // for(int i = 0; i<s.length(); i++)
        // {
        //         arr[s.charAt(i)-65]++;
        // }

        // //travers through the new array where we have put the elememts after calculation 
        // for(int i = 0; i<arr.length; i++)
        // {

        //     if (arr[i]==0) 
        //     {
        //         flag = true;
        //         System.out.println("Not a pangram");
        //     }
           
        // }
        
        // if (flag == false) 
        //     System.out.println("Pangram");






        //🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿
        //Anagram

        //Given string

        // String s1 = "keep";
        // String s2 = "peek";

        // //convert all upper to lowe 
        // s1 = s1.toLowerCase();
        // s2 = s2.toLowerCase();

        // //replace all the whitespaces if any
        // s1 = s1.replace(" ", "");
        // s2 = s2.replace(" ", "");

        // //converting string to array
        // char chArr1 [] = s1.toCharArray();
        // char chArr2 [] = s2.toCharArray();

        // //sorting all the elements
        // Arrays.sort(chArr1);
        // Arrays.sort(chArr2);

        // //
        // if(Arrays.equals(chArr1, chArr2))
        // {
        //     System.out.println("Anagram");
        // }
        // else
        //     System.out.println("Not an anagram");

    }
}
