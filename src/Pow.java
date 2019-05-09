public class Pow {
  public static int power (int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n%2 == 0) {
      return power(x,n/2) * power(x, n/2);
    } else {
      return x * power(x, n/2) * power(x, n/2);
    }
  }

  public static int power2 (int x, int n) {
    if (n == 0) {
      return 1;
    }
    // if odd using bit wise
    int pow = power(x, n/2);
    if (n & 1) {
      return pow*pow*x;
    } else {
      return pow * pow;
    }
  }
}
