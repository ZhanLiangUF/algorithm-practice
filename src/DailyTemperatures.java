public class DailyTemperatures {
  public int[] dailyTemperatures(int[] T) {
    int l = T.length;
    int[] returnList = new int[m];
    Stack<integer> stack = new Stack<>();
    for (int i = 0;i < l;i++) {
      // the goal in this loop is to find index of a temperature that is greater then things in the stack
      while (!stack.isEmpty() && T[i] > T[stack.peek()] {
        returnList[stack.peek()] = i-stack.pop();
      }
      // keep pushing index in order
      stack.push(i);
    }
  }
}
