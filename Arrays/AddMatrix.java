package Arrays;

public class AddMatrix {

  public static void main(String[] args) {

    int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] b = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] c = new int[a.length][a[0].length];

    int i;
    int j;
    for (i = 0; i < 3; ++i) {
      for (j = 0; j < 3; ++j) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }

    for (i = 0; i < c.length; ++i) {
      for (j = 0; j < c.length; ++j) {
        System.out.print(c[i][j] + " ");
      }

      System.out.println();
    }
  }

}
