/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(2);
		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(5);
		ListNode res = addTwoNumbers(l1, l2);
		while (res.next != null) {
			System.out.print(res.val + "->");
			res = res.next;
		}
		System.out.println(res.val);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode preHead = new ListNode(0);
		ListNode cur = preHead;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int sum = 0;
			if (l1 != null && l2 != null) {
				sum = l1.val + l2.val + carry;
				l1 = l1.next;
				l2 = l2.next;
			} else if (l1 != null) {
				sum = l1.val + carry;
				l1 = l1.next;
			} else { // l2 != null
				sum = l2.val + carry;
				l2 = l2.next;
			}
			cur.next = new ListNode(sum % 10);
			carry = sum / 10;
			cur = cur.next;
		}
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		return preHead.next;
	}
}
