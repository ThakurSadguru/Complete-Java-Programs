package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    int num = 81;
    int temp = num;
    System.out.println("Number is : " + num);

    int sum = 0;
    while (num > 0) {

      int rem = num % 10;
      sum = sum + rem;
      num = num / 10;
    }

    System.out.println("Sum " + sum);

    if (temp % sum == 0) {
      System.out.println("harshad");
    } else {
      System.out.println("no");
    }
  }

}