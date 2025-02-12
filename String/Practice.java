package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 5, 2, 4, 8, 1, 3 };

    for (int i = 0; i < a.length; i++) {
      int min = i;

      for (int j = i + 1; j < a.length; j++) {
        if (a[j] > a[min])
          min = j;
      }

      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }

    System.out.println(Arrays.toString(a));
  }
}
