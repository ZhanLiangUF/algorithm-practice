import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right;
    }
}
public class Postorder {
  public static List<Integer> postorder(Node node) {
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();
    List<Integer> list = new ArrayList<Integer>();

    s1.push(node);
    while (!s1.isEmpty()) {
      Node curr = s1.pop();
      s2.push(curr);
      if (curr.left != null) {
        s1.push(curr.left);
      }
      if (curr.right != null) {
        s1.push(curr.right);
      }
    }
    while (!s2.isEmpty()) {
      list.add(s2.pop());
    }
    return list;
  }
}
