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
  // memoization
  public static int lcs(char[] X, char[] Y, int m, int n) {
    int[][] arr = new int[n+1][m+1];
    for (i = 0;i < m+1;i++) {
      for (j = 0;j < n+1;j++) {
        if (i == 0 || j == 0) {
          arr[i][j] = 0;
        }
        if (X[i] == Y[j]) {
          arr[i][j] = arr[i-1][j-1] + 1;
        } else {
          arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
        }
      }


    }
  }
}
