package String;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5, 6 };
    int ele = 3;
    int cnt = 0;
    int start = 0;
    int end = a.length;

    while (start <= end) {

      int mid = (start + end) / 2;

      if (a[mid] == ele) {
        cnt++;
        System.out.println("Found");
        break;
      }

      if (a[mid] < ele)
        start = mid + 1;
      else
        end = mid - 1;
    }

    if (cnt == 0)
      System.out.println("not found");
  }

}