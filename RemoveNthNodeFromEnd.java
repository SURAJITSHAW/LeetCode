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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Calculate length
        ListNode tmp = head;
        int len = 0;
        while(tmp != null) {
            tmp = tmp.next;
            len++;
        }

        // edge case: given n is euals to length of the list
        if(len == n) {
            head = head.next;
            return head;
        }

        ListNode node = head;
        for (int i = 1; i < len-n; i++) {
            node = node.next;
        }
        node.next = node.next.next;

        return head;
    }
}