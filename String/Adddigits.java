package String;

public class Adddigits {

  public static void main(String[] args) {

    String s1 = "bg54af2asd";
    int sum = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
        int num = (s1.charAt(i) - 48);
        sum = sum + num;
      }

    }
    System.out.println(sum);
  }

}

// It extracts all digits from a string and adds them together.