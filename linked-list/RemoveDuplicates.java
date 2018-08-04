/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return pre.next;
    }
}
