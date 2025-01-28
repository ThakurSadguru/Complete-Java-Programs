package CoreJava;

import java.util.Scanner;

public class Reversenumber {

  public static void main(String[] args) {
    int number, reverse = 0, remainder;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number : ");
    number = sc.nextInt();

    while (number > 0) {
      remainder = number % 10;
      reverse = reverse * 10 + remainder;
      number = number / 10;
    }
    System.out.println("Reverse : " + reverse);
    sc.close();
  }
}
