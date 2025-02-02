package String;

import java.util.HashMap;
import java.util.Set;

public class Duplicatechar {

  public static void main(String[] args) {

  }

  static void duplicateCharCount(String inputString) {
    HashMap<Character, Integer> charCountMap = new HashMap<>();
    char[] strArray = inputString.toCharArray();

    for (char c : strArray) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        charCountMap.put(c, 1);
      }
    }

    Set<Character> charInString = charCountMap.keySet();
    System.out.println(" Duplicate in " + inputString);

    for (Character ch : charInString) {
      if (charCountMap.get(ch) > 1) {
        System.out.println(": " + charCountMap.get(ch));
      }
    }
  }
}
