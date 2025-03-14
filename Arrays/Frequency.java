package Arrays;

public class Frequency {

  public static void main(String[] args) {

    int arr[] = { 1, 2, 3, 4, 5, 3, 3 };

    System.out.println();
    int checkNum = 3;
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (checkNum == arr[i])
        cnt++;
    }
    if (cnt >= 2)
      System.out.println(checkNum + " is present in an array " + cnt + " time");
    else
      System.out.println(checkNum + " is present in an array " + cnt + " time");

  }

}
