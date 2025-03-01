package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 11, 33, 55, 22, 77, 66 };

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(a));
  }

}