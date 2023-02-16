import java.util.Scanner;

public class game1To100 {
    public static void main(String[] args) {
        int Number = (int)((Math.random())*100+1);
        System.out.println("Guess a number between 1-100");
        Scanner sc = new Scanner(System.in);
        int guess;
        while((guess = sc.nextInt())!=Number)
        {
            if(guess<Number)
            {
                System.out.println("You very low");
            }
            else if(guess>Number)
            {
                System.out.println("You are high");
            }
        }
            System.out.println("You got it " + Number);

        sc.close();
    }
}
