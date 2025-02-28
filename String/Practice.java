package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    String s1 = "12345a67";

    String ans = str(s1);

    System.out.println(ans);
  }

  private static String str(String s1) {
    int cnt = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
        cnt++;
      }
    }
    if (cnt == s1.length()) {
      return "same";

    } else {
      return "not same";
    }
  }

}