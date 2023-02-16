

import java.util.Scanner;


class Reverse {
    static String afterRev(String s){
        String s2= "";

        for(int i=s.length()-1; i>=0; i--){
            s2 += s.charAt(i);
        }
        System.out.println("Before Reversing: "+s);
        return s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("After Reversing: "+ afterRev(s));
        sc.close();
    }
}