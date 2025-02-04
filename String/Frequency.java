package String;

public class Frequency {

  public static void main(String[] args) {
    String s1 = "abcdedacbed";
    frequency(s1);
  }

  private static void frequency(String s1) {

    int max = 0;
    char ch = 0;
    for (int i = 0; i < s1.length(); i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (s1.charAt(i) == s1.charAt(j))
          cnt++;
      }
      if (cnt == 0) {
        int freq = 0;
        for (int j = 0; j < s1.length(); j++) {
          if (s1.charAt(i) == s1.charAt(j))
            freq++;
        }
        if (freq > max) {
          max = freq;
          ch = s1.charAt(i);
        }
      }
    }
    System.out.println(ch + " " + max);
  }

}