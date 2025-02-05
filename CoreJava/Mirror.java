package CoreJava;

public class Mirror {

  public static void main(String[] args) {
    String s1 = "VARUN DHAWAN";
    System.out.println("CAP " + (int) 'A' + " " + (int) 'Z');
    System.out.println("SMA " + (int) 'a' + " " + (int) 'z');
    String s2 = "";

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
        s2 += (char) (90 - (int) s1.charAt(i) + 65);
      else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
        s2 += (char) (122 - (int) s1.charAt(i) + 97);
      else
        s2 += s1.charAt(i);
    }

    System.out.println(s2);
  }
}
