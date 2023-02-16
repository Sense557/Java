import java.util.Scanner;

public class GuesserGame1 {
  public static void main(String[] args) {

    

    System.out.println("Guess a number between 1 and 100:");
    Scanner scanner = new Scanner(System.in);
    
    int number = (int) (Math.random()*100+1);
  
    
    int guess;

    while ((guess = scanner.nextInt())!= number) {
      if (guess < number) {
        System.out.println("Too low. Guess again:");
      } else {
        System.out.println("Too high. Guess again:");
      }
    }
    System.out.println("You got it! The number was " + number);

    scanner.close();
  }
}


