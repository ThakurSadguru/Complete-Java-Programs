package String;

import java.util.Arrays;

public class ReverseeachWord {

  public static void main(String[] args) {
    String s1 = "you are very very very good students";
    String[] sa = s1.split(" ");
    int start = 0;
    int end = sa.length - 1;
    while (start <= end) {
      String temp = sa[start];
      sa[start] = sa[end];
      sa[end] = temp;
      start++;
      end--;

    }
    System.out.println(Arrays.toString(sa));
    String s2 = "";
    for (int i = 0; i < sa.length; i++) {
      s2 = s2 + sa[i] + " ";
    }
    System.out.print(s2);
  }
}
