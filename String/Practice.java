package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int end = 1;

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= end; j++) {

        if (i == 1 && j == 1) {
          break;
        } else if (j == i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
      end = end + 2;

    }
  }
}