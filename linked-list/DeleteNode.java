/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
class DeleteNode {
    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }
}
