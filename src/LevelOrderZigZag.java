public class LevelOrderZigZag {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    List<List<Integer>> returnList = new ArrayList();
    if (root == null) { return returnList; }
    boolean z = false;
    while(!q.isEmpty()) {
        int size = q.size();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size;i++) {
            if (q.peek().left != null) {
                q.add(q.peek().left);
            }
            if (q.peek().right != null) {
                q.add(q.peek().right);
            }
            list.add(q.poll().val);
        }
        if (z) Collections.reverse(list);
        returnList.add(list);
        z = !z;
    }
    return returnList;
  }
}
