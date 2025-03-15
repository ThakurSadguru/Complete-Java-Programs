package Arrays;

import java.util.Arrays;

public class Duplicate {

  public static void main(String[] args) {

    int a[] = { 1, 4, 2, 5, 3, 4, 2 };

    int uniqueCnt = 0;
    for (int i = 0; i < a.length; i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j])
          cnt++;
      }
      if (cnt >= 1)
        uniqueCnt++;
    }
    int b[] = new int[uniqueCnt];
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j])
          cnt++;
      }
      if (cnt >= 1) {
        b[index] = a[i];
        index++;
      }
    }
    System.out.println(Arrays.toString(b));
  }
}