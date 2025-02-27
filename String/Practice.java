package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int evencnt = 0;
    int oddCnt = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0)
        evencnt++;
      else
        oddCnt++;
    }

    int b[] = new int[evencnt];
    int c[] = new int[oddCnt];

    int evenIndex = 0;
    int oddIndex = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        b[evenIndex] = a[i];
        evenIndex++;
      } else {
        c[oddIndex] = a[i];
        oddIndex++;
      }
    }

    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
  }

}