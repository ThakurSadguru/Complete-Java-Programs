package Collection.HashMap;

import java.util.HashMap;

public class CheckDuplicate {

  public static void main(String[] args) {

    int arr[] = { 1, 2, 3, 3, 5, 6 };

    HashMap<Integer, Boolean> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num)) {
        System.out.println("Duplicate found");
        return;
      }
      map.put(num, true);
    }
  }
}
