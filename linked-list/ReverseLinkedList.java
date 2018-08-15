/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        while (head.next != null) {
            ListNode cur = head.next;
            head.next = head.next.next;
            cur.next = pre.next;
            pre.next = cur;
        }
        return pre.next;
    }
}
