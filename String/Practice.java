package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, };

    int b[] = { 1, 2, 3, 4, 9 };

    if (a.length == b.length) {
      int cnt = 0;
      for (int i = 0; i < a.length; i++) {
        if (a[i] == b[i])
          cnt++;
      }
      if (cnt == a.length)
        System.out.println("same");
      else
        System.out.println(" not Same");

    } else
      System.out.println("length");
  }

}