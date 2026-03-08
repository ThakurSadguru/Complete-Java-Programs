package String;

import java.util.Arrays;

public class MethodsofString {

  public static void main(String[] args) {

    String s1 = "hefshine";
    int lastIndex = s1.lastIndexOf("shine");
    System.out.println(lastIndex);
    System.out.println("*********************");

    boolean blank = s1.isBlank();
    System.out.println(blank);
    System.out.println("*********************");

    boolean empty = s1.isEmpty();
    System.out.println(empty);
    System.out.println("*********************");

    int indexof = s1.indexOf("hello");
    System.out.println(indexof);

    boolean startWith = s1.startsWith("hef");
    System.out.println(startWith);
    System.out.println("*********************");
    boolean endsWith = s1.endsWith("ene");
    System.out.println(endsWith);
    System.out.println("*********************");
    boolean contains = s1.contains("hef");
    System.out.println(contains);
    System.out.println("*********************");
    String s4 = "software";
    String s5 = s1.concat(s4);
    System.out.println(s5);

    String s2 = "hEfshine";
    int compareToIgnore = s1.compareToIgnoreCase(s2);
    System.out.println(compareToIgnore);
    System.out.println("*********************");
    int compareTo = s1.compareTo(s2);
    System.out.println(compareTo);
    System.out.println("*********************");
    int codepoint = s1.codePointAt(4);
    System.out.println(codepoint);
    System.out.println("*********************");
    char ch = s1.charAt(4);
    System.out.println(ch);
    System.out.println("*********************");
    String s3 = s1.replace('e', 'z');
    System.out.println(s3);

    String lower = s1.toLowerCase();
    System.out.println(lower);

    String upper = s1.toUpperCase();
    System.out.println(upper);

    String repeat = s1.repeat(3);
    System.out.println(repeat);

    String sub = s1.substring(1, 5);
    System.out.println(sub);

    String[] sa = s1.split("e");
    System.out.println(Arrays.toString(sa));

    String s6 = " hef shine ";
    String trimString = s6.trim();
    System.out.println(trimString);

    char ca1[] = s1.toCharArray();
    System.out.println(Arrays.toString(ca1));

    char ca[] = { 'h', 'e', 'f' };
    String s7 = new String(ca);

    System.out.println(s7);
  }
}
