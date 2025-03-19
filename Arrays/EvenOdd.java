package Arrays;

import java.util.Arrays;

public class EvenOdd {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5, 6 };
    int evenCnt = 0;
    int oddCnt = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0)
        evenCnt++;
      else
        oddCnt++;
    }
    int evenArr[] = new int[evenCnt];
    int oddArr[] = new int[oddCnt];

    int evenInd = 0;
    int oddInd = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        evenArr[evenInd] = a[i];
        evenInd++;
      } else {
        oddArr[oddInd] = a[i];
        oddInd++;
      }
    }

    System.out.println(Arrays.toString(evenArr));
    System.out.println(Arrays.toString(oddArr));
  }
}
