package Arrays;

public class AddAvg {

  public static void main(String[] args) {

    int a[] = { 10, 20, 30, 40, 50 };
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    System.out.println("sum of all arrays numbers : " + sum);

    int avg = sum / a.length;
    System.out.println("avg of all arrays numbers : " + avg);
  }

}