package String;

import java.util.HashMap;

public class Countchar {

  public static void main(String[] args) {
    CharCount("Hello from Java");
  }

  static void CharCount(String inputString) {
    HashMap<String, Integer> charCountMap = new HashMap<>();

    for (String s : inputString.split(" ")) {
      if (charCountMap.containsKey(s)) {
        charCountMap.put(s, charCountMap.get((s) + 1));
      } else {
        charCountMap.put(s, 1);
      }
    }

    System.out.println("count of character in given string : " + charCountMap);
  }
}
