package Collection.HashMap;

import java.util.HashMap;

//Count Frequency of Elements

public class Frequency {

  public static void main(String[] args) {

    HashMap<Integer, Integer> map = new HashMap<>();

    int[] arr = { 1, 2, 3, 4, 1, 2, 5 };

    for (int num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }

      // or u can use shortcut

      // Step 2: Count frequency
      //
      // for (int num : arr) {
      // map.put(num, map.getOrDefault(num, 0) + 1);
      // }

    }
    System.out.println(map);

  }
}
