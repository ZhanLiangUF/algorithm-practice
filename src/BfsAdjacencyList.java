/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if (root == null) {
            return returnList;
        }
        Queue<TreeNode> s = new LinkedList<TreeNode>();
        s.add(root);
        while(!s.isEmpty()) {
            int size = s.size();
            ArrayList<Integer> levelList = new ArrayList();
            for (int i = 0;i < size; i++) { 
                TreeNode node = s.poll();
                levelList.add(node.val);
                if (node.left != null) { 
                    s.add(node.left);
                }
                if (node.right != null) {
                    s.add(node.right);
                }
            }
            returnList.add(levelList);
        }
            return returnList;
        }
    }