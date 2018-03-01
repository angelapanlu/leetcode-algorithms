//Remove Nth Node From End of List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        int m = 0;
        ListNode cur = pre, preHead = pre;
        for (int i = 1 ; i <= n ; i ++ ) {
            cur = cur.next;
            if (cur == null) {
                return null;
            }
        }
        if (cur == null) {
            return null;
        }
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return preHead.next;
    }
}
