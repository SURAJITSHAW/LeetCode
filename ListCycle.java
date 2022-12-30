/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // edge case
        if (head == null || head.next == null) return false;

        // Take 2 pointers fast & slow, both initially points to the head
        ListNode fast = head;
        ListNode slow = head;

        // Now move fast by 2 nodes, and slow by 1
        // each time before moving the pointers, had to check that it doesn't points to null, if null then it'll generate NullPOinterException
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}