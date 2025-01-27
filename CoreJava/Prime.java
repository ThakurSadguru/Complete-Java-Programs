package CoreJava;

import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = scanner.nextInt();

    if (number <= 1) {
      System.out.println(number + "is not prime number");
    } else {
      boolean isPrime = true;
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(number + "is a prime");
      } else {
        System.out.println(number + "is not a prime");
      }
    }

    scanner.close();
  }
}
