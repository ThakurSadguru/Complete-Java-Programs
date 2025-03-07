package Pattern;

public class Starpattern {

  public static void main(String[] args) {

    int start = 0;
    int end = 5;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= start; j++) {
        System.out.print("#");
      }
      for (int j = 1; j <= end; j++) {
        {
          System.out.print("* ");
        }
      }
      System.out.println();
      if (i < 5) {
        start++;
        end--;
      } else {
        start--;
        end++;
      }

    }

    System.out.println("------------------------------------------------------------1");

    int endd = 4;
    int starend = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= endd; j++) {
        System.out.print("#");
      }
      for (int j = 1; j <= starend; j++) {
        System.out.print("*");

      }
      System.out.println();
      endd--;
      starend++;
    }

    System.out.println("------------------------------------------------------------2");

    int count = 4;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j <= count)
          System.out.print("#");
        else
          System.out.print("*");

      }
      System.out.println();
      count--;
    }

    System.out.println();

    System.out.println("------------------------------------------------------------3");

    int end1 = 4;
    int starend1 = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end1; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= starend1; j++) {
        System.out.print("*");

      }
      System.out.println();
      end1--;
      starend1++;
    }

    System.out.println("------------------------------------------------------------4");

    int cnt = 0;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j <= cnt)
          System.out.print(" ");
        else
          System.out.print("*");

      }
      System.out.println();
      cnt++;
    }
    System.out.println("------------------------------------------------------------5");

    int cnt1 = 0;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j <= cnt1)
          System.out.print(" ");
        else
          System.out.print("*");

      }
      System.out.println();
      if (i < 5)
        cnt1++;
      else
        cnt1--;
    }

    System.out.println("------------------------------------------------------------6");

    int cnt2 = 5;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j <= cnt2)
          System.out.print(" ");
        else
          System.out.print("*");

      }
      System.out.println();
      if (i <= 5)
        cnt2--;
      else
        cnt2++;
    }

    System.out.println("------------------------------------------------------------7");

    int a = 4;
    int b = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= a; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= b; j++) {
        System.out.print("* ");
      }
      System.out.println();
      a--;
      b++;
    }

    System.out.println("------------------------------------------------------------8");

    int c = 1;
    int d = 4;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= c; j++) {
        if (j <= d)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      c++;
      d--;
    }
    System.out.println("------------------------------------------------------------9");

    end = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        System.out.print("*");

      }
      System.out.println();
      end = end + 2;

    }

    System.out.println("------------------------------------------------------------10");
    int ent = 1;
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j <= ent; j++) {
        System.out.print("*");
      }

      ent++;
      System.out.println();

    }

    System.out.println("------------------------------------------------------------11");

    int space = 4;
    int en1 = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= en1; j++) {
        System.out.print("*");

      }
      System.out.println();
      space--;
      en1++;
    }
    System.out.println();

    System.out.println("------------------------------------------------------------12");

    int f = 4;
    int g = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= f; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= g; j++) {
        System.out.print("* ");
      }
      System.out.println();
      f--;
      g++;
    }
    System.out.println("------------------------------------------------------------13");

    System.out.println("Diamond shaped pattern");

    int end2 = 1;
    int space2 = 5;
    for (int i = 1; i <= 11; i++) {

      for (int j = 1; j <= space2; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= end2; j++) {
        System.out.print("* ");
      }
      System.out.println();
      if (i <= 5) {
        end2++;
        space2--;
      } else {
        end2--;
        space2++;
      }
    }
    System.out.println();

    System.out.println("------------------------------------------------------------14");

    System.out.println("Downward Triangle Star Pattern");

    int end4 = 10;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= end4; j++) {
        System.out.print("*");
      }

      end4--;
      System.out.println();
    }
    System.out.println();

    System.out.println("------------------------------------------------------------15");

    System.out.println("Reverse Pyramid Star Pattern");

    int end5 = 5;
    int space5 = 0;
    for (int i = 1; i <= 6; i++) {

      for (int j = 1; j <= space5; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= end5; j++) {
        System.out.print("* ");
      }
      System.out.println();
      end5--;
      space5++;
    }
    System.out.println();
    System.out.println("------------------------------------------------------------16");

    System.out.println("Right Down Mirror Star Pattern");

    int space6 = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        if (j <= space6) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      space6++;
      System.out.println();
    }
    System.out.println();
    System.out.println("------------------------------------------------------------17");

    System.out.println("Right Pascal's Triangle");

    int end7 = 1;
    for (int i = 1; i <= 11; i++) {
      for (int j = 1; j <= end7; j++) {
        System.out.print("*");
      }
      System.out.println();
      if (i < 6)
        end7++;
      else
        end7--;
    }
    System.out.println();
    System.out.println("------------------------------------------------------------18");

    System.out.println("Left Pascal's Triangle");

    int end3 = 1;
    int space3 = 5;
    for (int i = 1; i <= 11; i++) {

      for (int j = 1; j <= space3; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= end3; j++) {
        System.out.print("*");
      }
      System.out.println();
      if (i <= 5) {
        end3++;
        space3--;
      } else {
        end3--;
        space3++;
      }
    }
    System.out.println();

    System.out.println("------------------------------------------------------------19");

    System.out.println("Sandglass Star Pattern");

    int start1 = 0;
    int end8 = 5;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= start1; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= end8; j++) {
        {
          System.out.print("* ");
        }
      }
      System.out.println();
      if (i < 5) {
        start1++;
        end8--;
      } else {
        start1--;
        end8++;
      }
    }
    System.out.println();
    System.out.println("------------------------------------------------------------20");

    int end9 = 5;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end9; j++) {
        System.out.print("*");
      }
      System.out.println();
      if (i < 5)
        end9--;
      else
        end9++;
    }
    System.out.println();

    System.out.println("------------------------------------------------------------21");

    int end10 = 1;
    // int cnt = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end10; j++) {
        if (i == 1 && j == 1)
          break;
        else if (j == i)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      end10 = end10 + 2;
    }
    System.out.println("------------------------------------------------------------22");

    System.out.println("------------------------------------------------------------");

    int s = 5;
    int e = 6;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 10; j++) {
        if (j <= s || j >= e)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
      if (i < 5) {
        s--;
        e++;
      } else {
        e--;
        s++;
      }

    }
    System.out.println("------------------------------------------------------------23");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j == 3 || i == 3)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("------------------------------------------------------------24");

    end = 5;

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        if (i == 1 || i == 5 || j == 1 || j == 5)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("------------------------------------------------------------25");

    space = 0;
    end = 9;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else {
          System.out.print("*");
          System.out.print(" ");
        }

      }
      System.out.println();
      space++;
      end--;
    }
    System.out.println("------------------------------------------------------------26");

    space = 0;
    end = 5;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      if (i <= 5) {
        space++;
      }
      if (i >= 5)
        end++;

    }
    System.out.println("------------------------------------------------------------27");

    space = 0;
    end = 9;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      if (i < 5) {
        end--;
        space++;
      } else {
        end++;
        space--;
      }
    }
    System.out.println("------------------------------------------------------------28");

    space = 4;
    end = 1;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*" + " ");
      }
      System.out.println();
      if (i < 5)
        space--;
      else
        space++;
    }
    System.out.println("------------------------------------------------------------29");

    space = 4;
    end = 5;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end; j++)

      {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      if (i < 5) {
        space--;
        end++;
      } else {
        end--;
        space++;
      }
    }
    System.out.println("------------------------------------------------------------29");

    space = 4;
    end = 9;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      space--;
      end--;
    }
    System.out.println("------------------------------------------------------------30");

    space = 0;
    end = 5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      space++;
      end++;
    }
    System.out.println("------------------------------------------------------------31");

    space = 0;
    end = 5;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= end; j++) {
        if (j <= space)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
      if (i < 5) {
        space++;
        end++;
      } else {
        space--;
        end--;
      }
    }
    System.out.println("------------------------------------------------------------32");

    System.out.println("------------------------------------------------------------33");

    int star = 1;
    int starEnd = 10;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 10; j++) {
        if (j <= star || j >= starEnd)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
      star++;
      starEnd--;
    }
    System.out.println("------------------------------------------------------------34");

    System.out.println("------------------------------------------------------------");
    System.out.println("------------------------------------------------------------");
    System.out.println("------------------------------------------------------------");
    System.out.println("------------------------------------------------------------");

  }

}
