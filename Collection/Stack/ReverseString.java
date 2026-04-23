package Collection.Stack;

import java.util.Stack;

public class ReverseString {

  public static void main(String[] args) {

    String s = "hello";

    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      stack.push(ch);
    }

    String result = "";
    while (!stack.isEmpty()) {
      result += stack.pop();
    }

    System.out.println(result);

  }
}