public class SumRootToLeafNumbers {
  public int sumNumbers(TreeNode root) {
    return sumNumbersHelper(root, 0);
  }
  public static int sumNumbersHelper(TreeNode root, int s) {
    if (root == null) {
      return 0;
    } else if (root.left == null && root.right == null) {
      return s*10 + root.val;
    } else {
      return sumNumbersHelper(root.right, s*10 + root.val) + sumNumbersHelper(root.left, s*10 + root.val);
    }
  }
}
