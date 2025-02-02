package String;

public class Reverseword {

  public static void main(String[] args) {
    String string = "Java is a programming language";

    String[] words = string.split(" ");
    String reverse = "";

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String string1 = "";

      char ch;
      for (int j = 0; j < word.length(); j++) {
        ch = word.charAt(j);
        string1 = ch + string1;
      }
      reverse = reverse + string1 + " ";

    }

    System.out.println(string);
    System.out.println(reverse);
  }
}
