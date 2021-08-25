/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode point = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(11, new Comparator<ListNode>() {
            public int compare(ListNode n1, ListNode n2) {
                return Integer.compare(n1.val,n2.val);
            }
        });
        for (ListNode l : lists) {
            if (l != null) {
                pq.add(l);
            }
        }
        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            point.next = new ListNode(curr.val);
            point = point.next;
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }
        return head.next;
    }
}