/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) { //keep the same value in pre node
                pre.val = cur.next.val;
            } else {
                cur = cur.next;
                continue;
            }
            while (cur.next != null && pre.val == cur.next.val) {//delete the nodes with same value
                cur.next = cur.next.next;
            }
        }
        return pre.next;
    }
}
