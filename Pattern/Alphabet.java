package Pattern;

import java.util.ArrayList;

public class Alphabet {

  public static void main(String[] args) {

    int end = 1;
    int cnt = 1;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end; j++) {
        System.out.print((char) (cnt + 64));

      }
      System.out.println();
      if (i < 5) {
        end++;
        cnt++;
      } else {
        end--;
        cnt--;
      }

    }

    System.out.println();
    System.out.println("------------------------------------------------------------1");

    end = 1;
    for (int i = 1; i <= 6; i++) {
      cnt = 6;

      for (int j = 1; j <= end; j++) {
        System.out.print((char) (cnt + 64));
        cnt--;
      }
      System.out.println();
      end++;

    }
    System.out.println();
    System.out.println("------------------------------------------------------------2");

    System.out.println("------------------------------------------------------------");

    end = 1;
    char ch = 'A';
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        System.out.print(ch);
      }
      System.out.println();
      end++;
      ch++;
    }
    System.out.println("------------------------------------------------------------3");
    end = 1;
    ch = 'A';
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end; j++) {
        System.out.print(ch);
      }
      System.out.println();
      if (i < 5) {
        end++;
        ch++;
      } else {
        end--;
        ch--;
      }
    }
    System.out.println("------------------------------------------------------------4");

    end = 1;
    for (int i = 1; i <= 9; i++) {
      ch = 'A';
      for (int j = 1; j <= end; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
      if (i < 5)
        end++;
      else
        end--;
    }
    System.out.println("------------------------------------------------------------5");

    end = 5;
    ch = 'F';
    for (int i = 1; i <= 12; i++) {
      char ch1 = ch;
      for (int j = 1; j <= end; j++) {
        System.out.print(ch1);
        ch1--;
      }
      System.out.println();
      if (i < 6) {
        end--;
        ch--;
      } else {
        end++;
        ch++;
      }
    }
    System.out.println("------------------------------------------------------------6");

    end = 6;
    for (int i = 1; i <= 12; i++) {
      ch = 'A';
      for (int j = 1; j <= end; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
      if (i < 6)
        end--;
      else if (i == 7)
        end++;
      else
        end++;

    }
    System.out.println("------------------------------------------------------------7");

    end = 6;
    for (int i = 1; i <= 6; i++) {
      ch = 'F';
      for (int j = 1; j <= end; j++) {
        System.out.print(ch);
        ch--;
      }
      System.out.println();
      end--;

    }
    System.out.println("------------------------------------------------------------8");

    end = 1;
    for (int i = 1; i <= 6; i++) {
      ch = 'F';
      for (int j = 1; j <= end; j++) {
        System.out.print(ch);
        ch--;
      }
      System.out.println();
      end++;
    }
    System.out.println("------------------------------------------------------------9");
    end = 1;
    ch = 'A';
    for (int i = 1; i <= 6; i++) {
      char ch1 = ch;
      for (int j = 1; j <= end; j++) {
        System.out.print(ch1);
        ch1++;
      }
      System.out.println();
      end++;
      ch++;
    }
    System.out.println("------------------------------------------------------------10");

    end = 1;
    ch = 'A';
    for (int i = 1; i <= 6; i++) {
      char ch1 = ch;
      for (int j = 1; j <= end; j++) {
        System.out.print(ch1);
        ch1--;
      }
      System.out.println();
      end++;
      ch++;
    }

    System.out.println("------------------------------------------------------------11");

    end = 1;
    ch = 'A';
    for (int i = 1; i <= 6; i++) {
      char ch1 = ch;
      for (int j = 1; j <= end; j++) {
        System.out.print(ch1);
        ch1 += 5;
      }
      System.out.println();
      end++;
      ch++;
    }

    System.out.println("------------------------------------------------------------12");

    end = 5;
    int space = 4;
    int mid = 5;
    for (int i = 1; i <= 5; i++) {
      ch = 'A';
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else {
          System.out.print(ch);
          if (j < mid)
            ch++;
          else
            ch--;
        }
      }
      System.out.println();
      end++;
      space--;
    }

    System.out.println("------------------------------------------------------------13");

    System.out.println("------------------------------------------------------------");

    end = 1;
    space = 0;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("N");
      }
      System.out.println();
      end++;
      space++;
    }

    System.out.println("------------------------------------------------------------14");

    System.out.println("Pattern..87..................");
    System.out.println();

    int start = 1;
    end = 5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j == start || j == end)
          System.out.print("A");
        else
          System.out.print(" ");
      }
      System.out.println();
      start++;
      end--;
    }

    System.out.println();
    System.out.println("Pattern..88..................15");
    System.out.println();

    System.out.println("------------------------------------------------------------16");

    int a[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };

    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < a[i].length; j++) {
          al.add(a[i][j]);
        }
      }
      if (i % 2 != 0) {
        for (int j = a[i].length - 1; j >= 0; j--) {
          al.add(a[i][j]);
        }
      }
    }
    System.out.println(al);

    System.out.println("------------------------------------------------------------17");

  }

}
