package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int[] a = { 1, 1, 2, 3, 2 };
    int uniquele = 0;
    for (int i = 0; i < a.length; i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j])
          cnt++;

      }
      if (cnt == 0)
        uniquele++;

    }
    int[] b = new int[uniquele];
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j])

          cnt++;
      }
      if (cnt == 0) {
        b[index] = a[i];
        index++;
      }
    }
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b.length; j++) {
        System.out.println(b[i] + " " + b[j] + " ");
      }
    }
  }

}
