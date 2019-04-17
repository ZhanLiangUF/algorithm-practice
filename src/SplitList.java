public class SplitList {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];
        int len = 0;
        // length of linkedlist
        for (ListNode node = root; node != null; node = node.next)
            len++;
        int n = len / k, r = len % k; // n : minimum guaranteed part size; r : extra nodes spread to the first r parts;
        ListNode node = root, prev = null;
         for (int i = 0; node != null && i < k; i++) {
            parts[i] = node;
        }
        return parts;
    }
}
