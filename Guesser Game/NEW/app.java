import java.util.Scanner;

class app
{
  public static void main(String [] args)
  {
    System.out.println("Let's begin the match. Are u READY");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rounds you want to play: ");
    int rounds = sc.nextInt();
    int[] scores = new int[4];
    
    for (int i = 0; i < rounds; i++) {
      Umpire u = new Umpire();
      u.collectNumFomGuesser();
      u.collectNumFromPlayer();
      u.compare();

      // Store the result of each round
      if (u.numFromGuesser == u.numFromPlayer1) {
        scores[1]++;
      } else if (u.numFromGuesser == u.numFromPlayer2) {
        scores[2]++;
      } else if (u.numFromGuesser == u.numFromPlayer3) {
        scores[3]++;
      } else {
        scores[0]++;
      }
    }

    // Print the final results
    System.out.println("Final Results:");
    System.out.println("No. of rounds where nobody won: " + scores[0]);
    System.out.println("No. of rounds won by player 1: " + scores[1]);
    System.out.println("No. of rounds won by player 2: " + scores[2]);
    System.out.println("No. of rounds won by player 3: " + scores[3]);
  }
}
