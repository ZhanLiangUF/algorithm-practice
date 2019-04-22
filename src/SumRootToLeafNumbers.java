public class SumRootToLeafNumbers {
      public int sumNumbers(TreeNode root) {
          return sumNumbersHelper(root)
      }
      public static int sumNumbersHelper(TreeNode root, int s) {
          if (root == null) {
              return s
          } else {
              return sumNumbers(root.left, s +) + sumNumbers(root.right, s)
          }
      }
}
