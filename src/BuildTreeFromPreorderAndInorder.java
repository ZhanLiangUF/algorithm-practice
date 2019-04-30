public class BuildTreeFromPreorderAndInorder {

  private int p;
  public TreeNode buildTree(int[] preorder, int[] inorder) {
      if (preorder.length == 0) return null;

  // Find Index
      p = 0; int i = 0;
      while (preorder[p] != inorder[i]) i++;

      // Create Root & Children
      TreeNode root = new TreeNode(preorder[p++]);
      if (i > 0)
          root.left = leftChild(preorder, inorder, 0, i-1);
      if (i < preorder.length-1)
          root.right = rightChild(preorder, inorder, i+1, inorder.length-1);

      // Return Root
      return root;
  }

  private TreeNode leftChild(int[] preorder, int[] inorder, int l, int r){

      // Find Index
      int i = r;
      while (i >= l && preorder[p] != inorder[i]) i--;
      if (i < l) return null;

      TreeNode root = new TreeNode(preorder[p++]);
      if (i > l) {
          root.left = leftChild(preorder, inorder,l, i-1);
      }
      if (i < r) {
          root.right = rightChild(preorder, inorder,i+1,r);
      }

      return root;

  }

  private TreeNode rightChild(int[] preorder, int[] inorder, int l, int r) {
      int i = l;
      while (i <= r && preorder[p] != inorder[i]) i++;
      if (i > r) return null;

      TreeNode root = new TreeNode(preorder[p++]);
        if (i > l) {
          root.left = leftChild(preorder, inorder,l, i-1);
      }
      if (i < r) {
          root.right = rightChild(preorder, inorder,i+1,r);
      }

      return root;
  }
}
// whne just looking at pre order

       3
      /  \
    9    20
