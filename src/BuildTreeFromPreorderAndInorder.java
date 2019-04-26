public class BuildTreeFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

    }

    public TreeNode buildTreePreOrder(int[] preorder, TreeNode root, int index) {
      if (index == 0 && preorder.length > 0) {
          root = new TreeNode(preorder[index]);
          return buildTreePreOrder(preorder, root , index+1);
      } else if (preorder[index] )

          // inorder traversal splits tree into left and right while preorder tells you order
    }
}
// whne just looking at pre order

       3
      /  \
    9    20 
