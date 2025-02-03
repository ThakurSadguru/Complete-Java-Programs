package String;

public class Comparelexicography {

  public static void main(String[] args) {
    String s1 = "abcdh";
    String s2 = "abcd";
    int cnt = 0;

    for (int i = 0; i < s1.length() && i < s2.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        System.out.println(s1.charAt(i) - s2.charAt(i));
        cnt++;
        break;
      }
    }
    if (cnt == 0)
      System.out.println(s1.length() - s2.length());
  }
}
