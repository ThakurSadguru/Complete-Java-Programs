package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int num = 9;
    int temp = num;

    int sq = num * num;
    int cnt = 0;

    while (num > 0) {
      num = num / 10;
      cnt++;
    }

    int div = (int) Math.pow(10, cnt);

    int fpart = sq / div;
    int spart = sq % div;

    int add = fpart + spart;

    if (add == temp)
      System.out.println("K");
    else
      System.out.println("N");

  }
}