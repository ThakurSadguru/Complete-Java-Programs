package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5 };
    int max = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max)
        max = a[i];
    }

    System.out.println(max);

  }
}