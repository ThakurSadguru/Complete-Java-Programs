package Arrays;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {

    int[] a = { 55, 33, 66, 55, 11, 77, 22 };
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
