package String;

public class Twice {

  public static void main(String[] args) {
    String s1 = "aadcdefff";

    String ans = str(s1);
    System.out.println(ans);
  }

  private static String str(String s1) {
    String s2 = "";
    for (int i = 0; i < s1.length(); i++) {
      s2 = s2 + s1.charAt(i) + s1.charAt(i);
    }
    return s2;
  }
}
