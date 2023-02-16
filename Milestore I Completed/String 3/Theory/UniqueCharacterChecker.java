

class UniqueCharacterChecker {

  static boolean hasUniqueCharacters(String str) {
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(j) == ch) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "hello";
    if (hasUniqueCharacters(str)) {
      System.out.println("The string contains unique characters.");
    } else {
      System.out.println("The string does not contain any unique characters.");
    }
  }
}
