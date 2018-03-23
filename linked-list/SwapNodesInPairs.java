/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode cur = preHead;
        while (cur.next != null && cur.next.next != null) {
            ListNode tmp = cur.next;
            cur.next = cur.next.next;
            cur = cur.next;
            tmp.next = cur.next;
            cur.next = tmp;
            cur = cur.next;
        }
        return preHead.next;
    }
}
