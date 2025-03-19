package Arrays;

public class Replace {

  public static void main(String[] args) {

    int arr[] = { 1, 0, 1, 0, 1, 0 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        arr[i] = 1;
      }
      System.out.println(arr[i]);
    }
  }
}
