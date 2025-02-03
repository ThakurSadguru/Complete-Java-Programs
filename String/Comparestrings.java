package String;

public class Comparestrings {

  public static void main(String[] args) {
    String s1 = "abcdeg";
    String s2 = "abcdef";
    int cnt = 0;

    if (s1.length() == s2.length()) {
      for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) == s2.charAt(i))
          cnt++;
      }
      if (cnt == s1.length())
        System.out.println("same");
      else
        System.out.println("not same");
    } else
      System.out.println(" index not matched");
  }
}
