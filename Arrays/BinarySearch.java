package Arrays;

public class BinarySearch {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5, 6, 7 };
    int ele = 5;
    int cnt = 0;
    int start = 0;
    int end = a.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (a[mid] == ele) {
        cnt++;
        System.out.println("found at index " + mid);
        break;
      }
      if (ele > a[mid])
        start = mid + 1;
      else
        end = mid - 1;
    }
    if (cnt == 0)
      System.out.println("not found");
  }

}
