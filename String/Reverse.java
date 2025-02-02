package String;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String input = sc.nextLine();

    char ch;
    String string2 = "";

    for (int i = 0; i < input.length(); i++) {
      ch = input.charAt(i);
      string2 = ch + string2;
    }

    System.out.println("Reverse String is : " + string2);

    sc.close();
  }
}
