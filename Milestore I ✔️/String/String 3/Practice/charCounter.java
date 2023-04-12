import java.util.Scanner;

public class charCounter {

    static void charCount(String s){
        // StringBuilder sb = new StringBuilder();
        int vowels = 0, consonants =0, specialChar = 0;

    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            vowels++;
        }else if (ch > 'a' && ch < 'z') {
            consonants++;
        }else{
            specialChar++;
        }      
    }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("SpecialChar: "+specialChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
       
        System.out.println("after counting we got");
        charCounter.charCount(s);
        sc.close();
    }
}
