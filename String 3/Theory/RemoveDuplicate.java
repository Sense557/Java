
import java.util.Scanner;

class RemoveDuplicate {

  static String removeDuplicate(String str) {
    boolean[] charSet = new boolean[256];
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) 
    {
      char c = str.charAt(i);
      if (!charSet[c]) 
      {
        charSet[c] = true;
        sb.append(c);
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string with duplicates: ");
    String str = sc.nextLine();

    System.out.println("String after removing duplicates: " + removeDuplicate(str));
    sc.close();
  }
}
