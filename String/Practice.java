package String;

import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    System.out.println("num2");
    int num2 = sc.nextInt();

    num = num + num2;
    num2 = num - num2;
    num = num - num2;

    System.out.println(num + "," + num2);

  }

}
