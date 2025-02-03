package String;

public class Arraytostring {

  public static void main(String[] args) {
    char ch[] = { 'h', 'e', 'l', 'l', 'o' };
    String s1 = "";

    for (int i = 0; i < ch.length; i++) {
      s1 += ch[i];
    }
    System.out.println(s1);
  }
}
