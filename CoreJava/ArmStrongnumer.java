package CoreJava;

import java.util.Scanner;

public class ArmStrongnumer {

  public static void main(String[] args) {
    int arm = 0, a, temp, number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number : ");
    number = sc.nextInt();
    temp = number;
    while (number > 0) {
      a = number % 10;
      number = number / 10;
      arm = arm + a * a * a;
    }
    if (arm == temp) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not Armstrong number");
    }
    sc.close();
  }
}/*       */