package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    String s1 = "sadguru hi how are u";

    for (int i = 0; i < s1.length(); i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (s1.charAt(i) == s1.charAt(j)) {
          cnt++;
          break;
        }
      }

      if (cnt == 0)
        System.out.println(s1.charAt(i));
    }
  }
}