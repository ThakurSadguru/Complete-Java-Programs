package Arrays;

import java.util.Arrays;

public class InterLeavingA {

  public static void main(String[] args) {

    char[] s1 = { 'a', 'b', 'c', 'd' };
    char[] s2 = { 'w', 'x', 'y', 'z', 'e', 'f', 'g' };
    char[] s3 = new char[s1.length + s2.length];
    int index = 0;

    for (int i = 0; i < s1.length || i < s2.length; i++) {
      if (i < s1.length) {
        s3[index++] = s1[i];

      }
      if (i < s2.length) {
        s3[index++] = s2[i];

      }
    }
    System.out.println(Arrays.toString(s3));

  }

}
