package Arrays;

public class FindElement {

  public static void main(String[] args) {

    int[] a = { 10, 20, 30, 40, 50 };
    int ele = 40;
    int cnt = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] == ele)
        cnt++;
    }

    if (cnt == 0)
      System.out.println("not found");
    else
      System.out.println("found");

  }
}
