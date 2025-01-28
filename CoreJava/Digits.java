package CoreJava;

import java.util.Scanner;

public class Digits {

  public static void main(String[] args) {

    int number = 0, digit = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    number = sc.nextInt();

    if (number < 0) {
      number = number * -1;
    } else if (number == 0) {
      number = 1;
    }
    while (number > 0) {
      number = number / 10;
      digit++;
    }
    System.out.println("Number of digits in given number is : " + digit);

    sc.close();
  }
}
