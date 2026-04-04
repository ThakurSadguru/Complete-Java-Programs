package Collection.HashMap;

import java.util.HashMap;

public class FirstNonRepeating {

  public static void main(String[] args) {

    int[] arr = { 5, 4, 3, 2, 3, 5 };

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int num : arr) {
      if (map.get(num) == 1) {

        System.out.println("First non-reapeting:" + num);
        break;
      }
    }

  }
}
