package CoreJava;

import java.util.Scanner;

public class Swapnumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter Second number: ");
    int b = sc.nextInt();
    System.out.println("Before swapping: a = " + a + ", b = " + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After swapping: a= " + a + ", b= " + b);

    sc.close();
  }
}
