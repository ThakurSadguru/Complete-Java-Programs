public class EvenOdd {

  public static void main(String[] args) {
    int num = 16;
    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    // alternate
    if (num % 2 != 0) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }

  }
}