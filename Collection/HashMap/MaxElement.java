package Collection.HashMap;

import java.util.HashMap;

public class MaxElement {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 5, 7, 4, 9, 3, 5 };

    HashMap<Integer, Integer> map = new HashMap<>();
    int maxCount = 0;
    int result = -1;

    // Step 1: Count frequency
    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // Step 2: Find max frequency element
    for (int key : map.keySet()) {

      if (map.get(key) > maxCount) {
        maxCount = map.get(key);
        result = key;
      }
    }

    System.out.println(result);
  }
}