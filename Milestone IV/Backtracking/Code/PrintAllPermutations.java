/**
 *  Print all permutations
 */

public class PrintAllPermutations {

    public static String swap(String str, int i, int j)
    {
        //swapping the current element of the string with the input string 
        char [] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    public static void permute(String str, int l, int r)
    {
        //BASE CASE
        if(l == r)
        {
            System.out.println(str);
        }
        //BACKTRACKING
        else
        {
            for(int i = l; i <= r; i++)
            {
                str = swap(str, l, r);
                permute(str, l+1, r);

                //backtracking
                str = swap(str, l, i);
            }
        }
    }

    public static void main(String[] args) {

        String str1 = "XY";
        int n1 = str1.length();
        System.out.println("For the string : "+str1+" permutations are: ");

        permute(str1, 0, n1-1);

        System.out.println();

        String str2 = "ABC";
        int n2 = str2.length();
        System.out.println("For the string : "+str2+" permutations are: ");

        permute(str2, 0, n2-1);
        
    }
}
