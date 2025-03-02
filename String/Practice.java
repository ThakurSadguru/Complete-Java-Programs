package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int num = 81;
    int temp = num;
    int sum = 0;

    while (num > 0) {

      int rem = num % 10;
      sum = rem + sum;
      num = num / 10;
    }

    if (num % sum == 0) {
      System.out.println("Harshad");
    } else {
      System.out.println("Not");
    }
  }
}