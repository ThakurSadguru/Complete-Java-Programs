package Arrays;

public class FindElement {

  public static void main(String[] args) {

    int[] a = { 10, 20, 30, 40, 50 };
    int ele = 40;
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == ele)
        sum++;

    }

    if (sum == 0)
      System.out.println("not found");
    else
      System.out.println("found");

  }
}
