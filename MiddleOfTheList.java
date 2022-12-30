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
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return head;
        }

        // Calculate length
        ListNode tmp = head;
        int len = 0;
        while(tmp != null) {
            tmp = tmp.next;
            len++;
        }
        ListNode midNode = head;
        // calc pos of middle node 
        int mid = (len/2) + 1;
        while(mid != 1) {
            midNode = midNode.next;
            mid--;
        }
        return midNode;
    }
}