package Arrays;

public class ArrayEqual {

  public static void main(String[] args) {

    int a[] = { 10, 20, 30, 40 };
    int b[] = { 10, 20, 30, 40 };

    if (a.length == b.length) {
      int cnt = 0;
      for (int i = 0; i < a.length; i++) {
        if (a[i] == b[i])
          cnt++;
      }
      if (cnt == a.length)
        System.out.println("same");
      else
        System.out.println("not same");
    } else
      System.out.println("Size not matched");
  }
}
