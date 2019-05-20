public class Inorder{
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> arr = new ArrayList<Integer>();
        TreeNode curr = root;
        while (curr != null) {
            s.push(curr);
            curr = curr.left;
        }

        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            arr.add(node.val);
            if (node.right != null) {
                s.push(node.right);
                curr = node.right.left;
                while (curr != null) {
                    s.push(curr);
                    curr = curr.left;
                }
            }

        }
        return arr;
    }
}
