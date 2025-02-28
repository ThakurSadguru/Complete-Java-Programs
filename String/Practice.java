package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 5, 3, 4, 2, 1 };

    Arrays.sort(a);

    int diff = a[1] - a[0];

    int cnt = 0;

    for (int i = 0; i < a.length - 1; i++) {
      if (((a[i + 1]) - (a[i])) == diff) {
        cnt++;
      }
    }

    if (cnt == a.length - 1)
      System.out.println("same");
    else
      System.out.println("no");
  }

}