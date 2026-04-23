package Collection.Stack;

import java.util.*;

import java.util.Stack;

public class NextGreater {

  public static void main(String[] args) {

    int[] nums = { 2, 1, 2, 4, 3 };

    int n = nums.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= nums[i]) {
        stack.pop();
      }

      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        result[i] = stack.peek();
      }

      stack.push(nums[i]);
    }

    System.out.println(Arrays.toString(result));

  }
}