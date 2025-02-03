package String;

import java.util.Scanner;

public class Concatenate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first string");
    String s1 = sc.nextLine();
    System.out.println("Enter concat String");
    String s2 = sc.nextLine();

    String s3 = s1 + " ";

    for (int i = 0; i < s2.length(); i++) {
      s3 += s2.charAt(i);
    }
    System.out.println(s3);
    sc.close();
  }
}
