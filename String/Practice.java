package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int space = 4;

    for (int i = 1; i <= 5; i++) {
      int cnt = 5;
      for (int j = 1; j <= 5; j++) {
        if (j <= space) {
          System.out.print(" ");
        } else {
          System.out.print(cnt);
          cnt--;
        }
      }
      System.out.println();
      space--;

    }

  }
}
