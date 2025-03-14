package Arrays;

import java.util.Arrays;

public class Consecutive {

  public static void main(String[] args) {

    int a[] = { 5, 3, 4, 2, 1, 6 };
    Arrays.sort(a);
    int dif = a[1] - a[0];
    int cnt = 0;
    for (int i = 0; i < a.length - 1; i++) {
      if (((a[i + 1]) - (a[i])) == dif)
        cnt++;
    }
    // System.out.println(cnt);
    if (cnt == a.length - 1)
      System.out.println("yes");
    else
      System.out.println("no");

  }

}
