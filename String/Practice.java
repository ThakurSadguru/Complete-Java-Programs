package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    String s1 = "sadguru";
    String s2 = "uru";

    if (s1.length() >= s2.length()) {
      int s1Index = s1.length() - 1;
      int s2Index = s2.length() - 1;
      int cnt = 0;

      while (s2Index >= 0) {
        if (s2.charAt(s2Index) == s1.charAt(s1Index)) {
          cnt++;
        }
        s1Index--;
        s2Index--;
      }

      if (cnt == s2.length())
        System.out.println("same");
      else
        System.out.println("not same");
    }

    else
      System.out.println("not");

  }
}