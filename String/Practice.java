package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 8, 9, 6 };

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - i - 1; i++) {
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