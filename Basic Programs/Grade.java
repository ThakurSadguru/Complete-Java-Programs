import java.util.Scanner;

public class Grade {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter obtain marks: ");
    int marks = sc.nextInt();

    // System.out.println("enter total marks: ");
    // int total = sc.nextInt();

    int percent = (marks / 500) * 100;
    if (percent >= 90) {
      System.out.println("Grade A");
    } else if (percent >= 80 && percent < 90) {
      System.out.println("Grade B");
    } else if (percent >= 70 && percent < 80) {
      System.out.println("Grade C");
    } else if (percent >= 60 && percent < 70) {
      System.out.println("Grade D");

    } else if (percent >= 40 && percent < 60) {
      System.out.println("Grade E");
    } else {
      System.out.println("Grade F");
    }
    sc.close();
  }
}
