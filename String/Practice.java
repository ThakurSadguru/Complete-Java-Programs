package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 5, 4, 3, 2, 6, 1 };
    Arrays.sort(a);

    int cnt = 0;
    int diff = a[1] - a[0];

    for (int i = 0; i < a.length - 1; i++) {
      if (((a[i + 1]) - (a[i])) == diff)
        cnt++;
    }

    if (cnt == a.length - 1) {
      System.out.println("Yes");
    } else
      System.out.println("No");
  }

}