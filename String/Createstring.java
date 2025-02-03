package String;

public class Createstring {

  public static void main(String[] args) {

    String s1 = new String("HelloWorld"); // it stores in heap memory
    System.out.println(s1);

    String s2 = "HelloWorld"; // it stores in string constant pool memory
    System.out.println(s2);

    System.out.println(s1 == s2); // both are not equal because it stores in different memory
  }
}
