package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array size");
    int size = sc.nextInt();

    int a[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter a number");
      int num = sc.nextInt();
      a[i] = num;

    }

    System.out.println(Arrays.toString(a));
  }
}