public class LCS {
  // naive solution
  // m is length of X and n is length of Y
  public static int lcs( char[] X, char[] Y, int m, int n ) {
    if (m == 0 || n == 0) {
      return 0;
    }
    if (X[m-1] == Y[n-1]) {
      return lcs(X, Y,m-1,n-1) + 1;
    } else {
      return Math.max(lcs(X, Y,m,n-1), lcs(X, Y,m-1,n);
    }
  }
}
