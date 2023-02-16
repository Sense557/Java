import java.util.Scanner;

public class maxFreq {
    static int maxFrequency(String s)
    {
        int frequency [] = new int [256];
        int max = 0;
        char result = ' ';

        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i)]++;
        if (frequency[s.charAt(i)]>max) {
            max = frequency[s.charAt(i)];
            result = s.charAt(i);
        }
    }
    System.out.println(result);
    return result;
    
}
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println("after counting one by one the result is: ");
        maxFreq.maxFrequency(s);
        sc.close();
    }
}
