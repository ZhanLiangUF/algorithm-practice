public class BuildTreeFromPreorderAndInorder {

  public TreeNode buildTree(int[] preorder, int[] inorder) {

       if (preorder.length == 0) return null;

       // Find Index where to split inorder into left and right side
       int topNodeValue = preorder[0];
       int index = Arrays.asList(inorder).indexOf(topNodeValue);
       int[] leftSide = Arrays.copyOfRange(inorder,0,index);
       int[] rightSide = Arrays.copyOfRange(inorder,index-1);
       TreeNode returnNode = new TreeNode(topNodeValue);
       returnNode.left = buildTreeHelper(preorder, inorder, leftSide);
       returnNode.right = buildTreeHelper(preorder, inorder, rightSide);
       return new TreeNode(0);
   }

   public TreeNode buildTreeHelper(int[] preorder, int[] inorder, int[] sideArr) {

   }
}
// whne just looking at pre order

       3
      /  \
    9    20
