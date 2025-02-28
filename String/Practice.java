package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number");
    int s1 = sc.nextInt();

    switch (s1) {
      case 1:
        System.out.println("MON");
        break;

      case 2:
        System.out.println("TUE");
        break;

      case 3:
        System.out.println("WED");
        break;

      case 4:
        System.out.println("THU");
        break;

      default:
        System.out.println("Enter Correct");
    }

  }

}