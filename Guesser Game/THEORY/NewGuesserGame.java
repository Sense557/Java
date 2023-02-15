import java.util.Scanner;

public class NewGuesserGame {
    public static void main(String[] args) {

        System.out.println("I have choosen a number between 1 to 100.");
        // System.out.println(" ");
        System.out.println("Can u guess it.");
        
        int target = (int)(Math.random()*100+1);
        Scanner KeyboardInput = new Scanner(System.in);
        int guess;
        int tries = 10;
        

        do
        {
            System.out.println("You have "+tries+" tries left "+"What's your guess?");

            guess = KeyboardInput.nextInt();
                if(guess < target)
                    {
                        System.out.println("You are lower");
                    }
                else if(guess > target)
                    {
                        System.out.println("You are higher");
                    }
                tries --;
            }
            while(guess != target && tries >0);

                if(guess == target)
                {
                    System.out.println("Congratulations You have got it");
                }
                else
                {
                    System.out.println("Better luck next time"+ "The target number was"+target);
                }
                KeyboardInput.close();
            }
        
    }
