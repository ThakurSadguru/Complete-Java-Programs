package CoreJava;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    long number = sc.nextLong();
    long temp = number;
    long reverse = 0;

    while (number != 0) {
      long digit = number % 10;
      reverse = reverse * 10 + digit;
      number = number / 10;
    }

    if (temp == reverse) {
      System.out.println(temp + "is palindrome");
    } else {
      System.out.println(temp + " is not palindrome");
    }

    sc.close();
  }
}
