public class CompoundInterest {

  public static void main(String[] args) {
    int p = 100;
    double r = 0.10;
    int n = 12;
    int t = 1;
    double firstpart = 1 + r / n;
    int secondpart = n * t;
    double CI = p * Math.pow(firstpart, secondpart);
    System.out.println(CI);

  }
}
