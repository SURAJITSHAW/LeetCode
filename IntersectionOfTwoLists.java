/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // edge case
        if (headA == null || headB == null) return null;

        // it's clearly mentioned that we can't change/modify the lists, thts's take 2 pointers
        ListNode l1 = headA;
        ListNode l2 = headB;

        // Even if there's no intersection node present, after the second iteration both pointer will point to null
        while (l1 != l2) {
            // it works like optional chaining in JS
            // syntax: condition? if True: else
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }

        return l1;
    }
}