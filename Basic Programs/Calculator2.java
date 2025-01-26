import java.util.Scanner;

public class Calculator2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter num1");
    int num1 = scanner.nextInt();

    System.out.println("Enter num2");
    int num2 = scanner.nextInt();

    System.out.println("Enter operator (*,+,-,/)");
    char operator = scanner.next().charAt(0);

    if (operator == '+')
      System.out.println("Addition : " + (num1 + num2));

    if (operator == '-')
      System.out.println("Substraction : " + (num1 - num2));

    if (operator == '*')
      System.out.println("Multiplication : " + (num1 * num2));

    if (operator == '/')
      System.out.println("Division : " + (num1 / num2));

    scanner.close();
  }
}
