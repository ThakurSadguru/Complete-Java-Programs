package Arrays;

public class Difference {

  public static void main(String[] args) {
    int a[] = { 5, 3, 6, 4, 2, 1 };
    for (int i = 0; i < a.length; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[min])
          min = j;
      }
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    int dif = a[a.length - 1] - a[0];
    System.out.println(dif);
  }
}
