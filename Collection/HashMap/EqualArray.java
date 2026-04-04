package Collection.HashMap;

import java.util.HashMap;

public class EqualArray {

  public static void main(String[] args) {

    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 3, 2, 1 };

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr1) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int num : arr2) {
      if (!map.containsKey(num)) {
        System.out.println("not equal");
        return;
      }
      map.put(num, map.get(num) - 1);
    }

    for (int val : map.values()) {
      if (val != 0) {
        System.out.println("Not equal");
        return;
      }
    }

    System.out.println("Array are equal");
  }
}
