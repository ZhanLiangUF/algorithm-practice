import java.util.*;
 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }
public class PostOrderIterative {
  
    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            if (root == null) return list;
            s1.push(root);
            while (!s1.isEmpty()) {
                TreeNode curr = s1.peek();
                if (curr.left == null && curr.right == null) {
                    list.add(s1.pop().val);
                } else {
                    if(curr.right != null) {
                        s1.add(curr.right);
                        curr.right = null;
                    }
                    if(curr.left != null) {
                        s1.add(curr.left);
                        curr.left = null;
                    }
                }
            }
            return list;
    }
  public static void main(String args[]) { 
      TreeNode left = new TreeNode(2);
      TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1,left,right);
        List<Integer> list = PostOrderIterative.postorderTraversal(root);
        System.out.println(list);
        System.out.println(root.left.val);
    }
    
}