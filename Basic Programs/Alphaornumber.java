import java.util.Scanner;

public class Alphaornumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter alphabet");
    char ch = sc.nextLine().charAt(0);

    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println("alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("number");
    } else
      System.out.println("Symbol");

  }
}
