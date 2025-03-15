package Arrays;

public class UniqueElement {

  public static void main(String[] args) {

    int[] a = { 9, 4, 5, 5, 4, 7, 7, };
    for (int i = 0; i < a.length; i++) {
      int cnt = 0;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j]) {
          cnt++;
          break;
        }
      }
      if (cnt == 0) {
        int count = 0;
        for (int j = 0; j < a.length; j++) {
          if (a[i] == a[j]) {
            count++;
          }
        }
        // System.out.println(a[i]+" "+count);
        if (count == 1) {
          System.out.println(a[i]);
        }
      }
    }
  }

}
