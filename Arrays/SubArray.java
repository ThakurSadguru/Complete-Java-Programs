package Arrays;

public class SubArray {

  public static void main(String[] args) {

    int a[] = { 3, 7, 90, 20, 5, 50, 40 };

    for (int i = 0; i <= a.length; i++) {
      for (int j = i; j <= a.length; j++) {
        for (int k = i; k < j; k++) {
          System.out.print(a[k] + " ");
        }
        System.out.println();
      }
    }

  }
}