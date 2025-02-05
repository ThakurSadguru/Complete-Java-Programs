package String;

public class Indexchar {

  public static void main(String[] args) {

    String s1 = "HelloWorld";

    for (int i = 0; i < s1.length(); i++) {
      System.out.println(i + "" + s1.charAt(i));
    }
  }
}
