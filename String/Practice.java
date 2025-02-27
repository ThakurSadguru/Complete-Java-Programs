package String;

public class Practice {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5 };
    int ele = 5;
    int start = 0;
    int end = a.length;
    int cnt = 0;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (a[mid] == ele) {
        cnt++;
        System.out.println("found");
        break;
      }
      if (a[mid] < ele)
        start = mid + 1;
      else
        end = mid - 1;
    }
    if (cnt == 0)
      System.out.println("not found");
  }

}