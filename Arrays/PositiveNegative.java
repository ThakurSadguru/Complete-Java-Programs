package Arrays;

public class PositiveNegative {

  public static void main(String[] args) {

    int[] a = { 11, -4, -5, 12, 14, -8, 15 };
    for (int i = 0; i < a.length; i++) {
      int max = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] > a[max]) {
          max = j;
        }
        int temp = a[i];
        a[i] = a[max];
        a[max] = temp;
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");
    }
  }

}
