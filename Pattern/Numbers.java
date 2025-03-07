package Pattern;

public class Numbers {

  public static void main(String[] args) {

    int end2 = 1;
    for (int i = 1; i <= 11; i++) {
      for (int j = 1; j <= end2; j++) {
        System.out.print(i);
      }
      System.out.println();
      if (i < 5)
        end2++;
      else
        end2--;
    }

    System.out.println("------------------------------------------------------------");

    int end = 1;
    for (int i = 1; i <= 5; i++) {
      int cnt = 1;
      for (int j = 1; j <= end; j++) {
        System.out.print(cnt);
        cnt++;
      }
      end++;
      System.out.println();
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    int space1 = 4;
    for (int i = 1; i <= 5; i++) {
      int cnt = 5;
      for (int j = 1; j <= 5; j++) {
        if (j <= space1)
          System.out.print(" ");
        else {
          System.out.print(cnt);
          cnt--;
        }
      }
      System.out.println();
      space1--;

    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    int space = 4;
    for (int i = 1; i <= 5; i++) {
      int cnt1 = 1;
      for (int j = 1; j <= 5; j++) {
        if (j <= space)
          System.out.print(" ");
        else {
          System.out.print(cnt1);
          cnt1++;
        }
      }
      System.out.println();
      space--;
    }
    System.out.println();
    System.out.println("------------------------------------------------------------");

    int end22 = 1;
    int cnt2 = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end22; j++) {
        System.out.print(cnt2);
      }
      System.out.println();
      end22++;
      cnt2++;
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    int end3 = 1;
    int cnt3 = 1;
    for (int i = 1; i <= 5; i++) {
      int temp = cnt3;
      for (int j = 1; j <= end3; j++) {
        System.out.print(temp);
        temp--;
      }
      System.out.println();
      end3++;
      cnt3++;
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    int end4 = 1;
    int cnt4 = 5;
    for (int i = 1; i <= 5; i++) {
      int temp = cnt4;
      for (int j = 1; j <= end4; j++) {
        System.out.print(temp);
        temp++;

      }
      System.out.println();
      end4++;
      cnt4--;
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    int end5 = 5;
    int cnt5 = 1;
    for (int i = 1; i <= 5; i++) {
      int temp = cnt5;
      for (int j = 1; j <= end5; j++) {
        System.out.print(temp);
        temp++;

      }
      System.out.println();
      end5--;
      cnt5++;
    }
    System.out.println();
    System.out.println("------------------------------------------------------------");

    int space2 = 4;
    for (int i = 5; i <= 1; i++) {
      int cnt = 5;
      for (int j = 1; j <= 5; j++) {
        if (j <= space2)
          System.out.print(" ");
        else {
          System.out.print(cnt + " ");
          cnt--;
        }
      }
      System.out.println();
      space2--;

    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    space2 = 4;
    for (int i = 1; i <= 5; i++) {
      int cnt = 1;
      for (int j = 1; j <= 5; j++) {
        if (j <= space2)
          System.out.print(" ");
        else {
          System.out.print(cnt + " ");
          cnt++;
        }

      }
      System.out.println();
      space2--;

    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    space2 = 0;
    int cnt = 1;
    for (int i = 1; i <= 5; i++) {
      cnt2 = cnt;
      for (int j = 1; j <= 5; j++) {
        if (j <= space2)
          System.out.print(" ");
        else {
          System.out.print(cnt2);
          cnt2++;
        }
      }
      System.out.println();
      space2++;

    }
    System.out.println();
    System.out.println("------------------------------------------------------------");

    end = 1;
    cnt = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        System.out.print(cnt);
        cnt++;

      }
      System.out.println();
      end++;
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    cnt = 1;
    end = 1;
    for (int i = 1; i <= 5; i++) {
      int cnt1 = cnt;
      int diff = 4;
      for (int j = 1; j <= end; j++) {

        System.out.print(cnt1 + " ");
        cnt1 = cnt1 + diff;
        diff--;
      }
      cnt++;
      end++;

      System.out.println();
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    end = 1;
    cnt = 1;
    for (int i = 1; i <= 5; i++) {
      int cnnt = cnt;
      for (int j = 1; j <= end; j++) {
        System.out.print(cnt5);
        if (j < i)
          cnt5++;
        else
          cnt--;

      }
      end = end + 2;
      System.out.println();

    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    System.out.println("------------------------------------------------------------");

    System.out.println("------------------------------------------------------------");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (i == j)
          System.out.print("*");
        else
          System.out.print("0");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("------------------------------------------------------------");

    for (int i = 1; i <= 7; i++) {
      cnt = 0;
      for (int j = 1; j <= 10; j++) {
        for (int k = 1; k <= 3; k++) {
          System.out.print(cnt);
        }
        cnt++;

      }
      System.out.println();

    }

    System.out.println("------------------------------------------------------------");

    int num = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (num % 2 == 0)
          System.out.print(0);
        else
          System.out.print(1);
      }
      System.out.println();
    }
    System.out.println("------------------------------------------------------------");

    System.out.println("------------------------------------------------------------");
    System.out.println("------------------------------------------------------------");
  }

}