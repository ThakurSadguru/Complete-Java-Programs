package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int end = 5;
    int space = 0;

    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= space; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= end; j++) {
        System.out.print("* ");
      }

      System.out.println();
      if (i < 5) {
        end--;
        space++;
      } else {
        end++;
        space--;
      }
    }
  }
}
