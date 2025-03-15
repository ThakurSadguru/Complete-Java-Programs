package Arrays;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {

    int[] a = { 55, 33, 66, 55, 11, 77, 22 };
    for (int i = 1; i < a.length; i++) {
      int temp = a[i];
      int j = i - 1;
      for (; j >= 0; j--) {
        if (a[j] > temp) {
          a[j + 1] = a[j];
        } else
          break;
      }
      a[j + 1] = temp;

    }
    System.out.println(Arrays.toString(a));
  }

}
