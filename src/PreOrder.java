public class PreOrder {
  public List<Integer> preorderTraversal(TreeNode root) {
       Stack<TreeNode> stack = new Stack<TreeNode>();
       stack.push(root);
       List<Integer> list = new ArrayList<Integer>();
       if (root == null) { return list; }
       while (!stack.isEmpty()) {
           TreeNode curr = stack.pop();
           list.add(curr.val);
           if (curr.right != null) {
               stack.push(curr.right);
           }
              if (curr.left != null) {
               stack.push(curr.left);
           }
       }
       return list;
   }
}
