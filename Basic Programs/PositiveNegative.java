import java.util.Scanner;

public class PositiveNegative {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number");
    int number = scanner.nextInt();

    if (number > 0) {
      System.out.println("Positive");
    } else if (number < 0) {
      System.out.println("Negative");
    } else
      System.out.println("Zero");

    scanner.close();
  }
}
