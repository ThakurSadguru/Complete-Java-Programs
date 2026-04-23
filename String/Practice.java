package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {

    String s1 = "Hello Welcome to java world";

    String a[] = s1.split(" ");

    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i].compareTo(a[i]) > 0) {
          String temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(a));

  }
}