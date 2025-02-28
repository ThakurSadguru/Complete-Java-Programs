package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    char ch = '#';

    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      System.out.println(ch + "alphabet");
    } else if (ch > '0' && ch <= '9') {
      System.out.println(ch + "number");
    }

    else {
      System.out.println("special");
    }

  }

}