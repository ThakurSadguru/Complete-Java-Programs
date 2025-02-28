package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5, 6 };
    int evencnt = 0;
    int oddcnt = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0)
        evencnt++;
      else
        oddcnt++;

    }

    int evenarr[] = new int[evencnt];
    int oddarr[] = new int[oddcnt];

    int evenIndex = 0;
    int oddIndex = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        evenarr[evenIndex] = a[i];
        evenIndex++;

      } else {
        oddarr[oddIndex] = a[i];
        oddIndex++;
      }
    }

    System.out.println(Arrays.toString(evenarr));
    System.out.println(Arrays.toString(oddarr));
  }

}