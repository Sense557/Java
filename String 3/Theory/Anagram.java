
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        //Given String str1 and str2
        String str1 = "School Master";
        String str2 = "The Classroomjava";


        //deleting all the blank spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");


        // //converting Sting to lowercase
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();


        //Converting String to Char Array
        char Array1[] = str1.toCharArray();
        char Array2[] = str2.toCharArray();


        //Sorting
        Arrays.sort(Array1);
        Arrays.sort(Array2);


        //Checking whether the elements in the string equal or not
        //if Y - Anagram
        //if N - Nor an Anagram
        
        if(Arrays.equals(Array1,Array2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }

    }
}
