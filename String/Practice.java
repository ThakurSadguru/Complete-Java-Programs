package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 3, 5, 2, 2 };
    int n = a.length;

    if (n == 1) {
      System.out.println(0);
    }
    int sum1 = 0, sum2 = 0;

    for (int i = 0; i < n; i++) {
      sum2 += a[i];
    }

    for (int i = 0; i < n; i++) {
      sum2 -= a[i];

      if (sum1 == sum2) {
        System.out.println(i);
      }

      sum1 += a[i];
    }
    System.out.println(-1);
  }
}