package String;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    char ch[] = { 'h', 'e', 'f', 's' };
    String s1 = "";
    for (int i = 0; i < ch.length; i++) {
      s1 += ch[i];
    }

    System.out.println(s1);
  }

}