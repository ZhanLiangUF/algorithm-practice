public class MaxConsecutiveOnesSlidingWindow {
  public int longestOnes(int[] A, int K) {
        int i = 0;
        int j;
        for (j= 0;j < A.length;j++) {
            if (A[j] == 0) { K--; }
            // increment i if k is less than 0, and if
            if (K < 0) {
                if (A[i] == 0) {K++;}
                i++;
            }


        }
        return j-i;
  }
}
