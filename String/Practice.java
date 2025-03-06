package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    String s1 = "sadguru";

    freq(s1);

  }

  private static void freq(String s1) {
    int max = 0;
    char ch = 0;

    for (int i = 0; i < s1.length(); i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (s1.charAt(i) == s1.charAt(j)) {
          cnt++;
        }
      }
      if (cnt == 0) {
        int freq = 0;
        for (int j = 0; j < s1.length(); j++) {
          if (s1.charAt(i) == s1.charAt(j)) {
            freq++;
          }

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