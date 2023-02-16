
import java.util.Scanner;

class MaximumOccurringCharacter {

  static char getMaxOccurringChar(String str) {
    int[] frequency = new int[256];
    int max = 0;
    char result = ' ';

    for (int i = 0; i < str.length(); i++) {
      frequency[str.charAt(i)]++;
      if (frequency[str.charAt(i)] > max) {
        max = frequency[str.charAt(i)];
        result = str.charAt(i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    System.out.println("The maximum occurring character is: " + getMaxOccurringChar(str));
    sc.close();
  }
}