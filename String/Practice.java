package String;

import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.err.println("ENTER no");
    int n = sc.nextInt();

    int i, c = 0, sum = 0;

    for (i = 1; i < n; i++) {
      if (n % i == 0)
        sum = sum + i;
    }

    if (sum == n)
      System.out.println(n + "is perfect no");
    else
      System.out.println(n + "not perfect no");

    sc.close();
  }
}