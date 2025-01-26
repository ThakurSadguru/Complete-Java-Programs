public class Alphaornumber {

  public static void main(String[] args) {
    char ch = 'u';
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      System.out.println("Alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("Number");
    } else {
      System.out.println("Special character");
    }
  }
}
