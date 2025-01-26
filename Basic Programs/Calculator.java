import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number");
    int num1 = scanner.nextInt();

    System.out.println("Enter the second number");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;
    System.out.println("Addition : " + sum);

    int substract = num1 - num2;
    System.out.println("Substraction : " + substract);

    int multiply = num1 * num2;
    System.out.println("Multiplication : " + multiply);

    int divide = num1 / num2;
    System.out.println("Divide : " + divide);

    int Remainder = num1 % num2;
    System.out.println("Remainder : " + Remainder);

    scanner.close();
  }
}
