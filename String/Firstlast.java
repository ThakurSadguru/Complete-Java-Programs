package String;

public class Firstlast {

  public static void main(String[] args) {

    String s1 = "hello world from java";
    String sa[] = s1.split(" ");

    for (int i = 0; i < sa.length; i++) {

      for (int j = i + 1; j < sa.length; j++) {
        if (sa[i].length() > sa[j].length()) {
          String temp = sa[i];
          sa[i] = sa[j];
          sa[j] = temp;
        }
      }
    }
    System.out.println(sa[0]);
    System.out.println(sa[sa.length - 1]); // first and last sorting //
  }
}
