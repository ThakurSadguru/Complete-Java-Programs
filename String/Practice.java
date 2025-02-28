package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    String s1 = "abcdefabs";
    String s2 = "";

    for (int i = 0; i < s1.length(); i++) {
      int cnt = 0;
      for (int j = i + 1; j < s1.length(); j++) {
        if (s1.charAt(i) == s1.charAt(j))
          cnt++;
      }

      if (cnt > 0)
        s2 += s1.charAt(i);
    }

    System.out.println(s2);
  }

}