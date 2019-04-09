/**
There is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.

We keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Find the last number that remains starting with a list of length n.
*/

public class EliminationGame {
  // first solution time limit exceeds
  public int lastRemaining(int n) {
          List<Integer> list = new ArrayList<Integer>();
          for (int i = 1;i<=n;i++) {
              list.add(i);
          }
          while (list.size() != 1) {
              n = n % 2 == 0 ? n/2:(n/2)+1;
              for (int i = 0;i<n;i++) {
                  list.remove(i);
              }
              // reverse the list instead of changing indexes for second pattern
              Collections.reverse(list);
              n = list.size();
          }
          return list.get(0);
  }
  
  public int lastRemaininglogN(int n) {

  }
}
