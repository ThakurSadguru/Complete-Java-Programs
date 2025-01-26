import java.util.Scanner;

public class Greatersmaller {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Num1");
    int num1 = scanner.nextInt();

    System.out.println("Enter Num2");
    int num2 = scanner.nextInt();

    System.out.println("Enter Num3");
    int num3 = scanner.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println("num1 is greater");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("num2 is greater");
    } else {
      System.out.println("num3 is greater");
    }

    if (num1 < num2 && num1 < num3) {
      System.out.println("num1 is smallest");
    } else if (num2 < num1 && num2 < num3) {
      System.out.println("num2 is smallest");
    } else {
      System.out.println("num3 is smallest");
    }
  }
}
