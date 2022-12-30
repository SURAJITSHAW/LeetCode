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
    // Approach2: In place merging
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       // if any of them points to null, return the other one
       if (list1 == null) return list2;
       if (list2 == null) return list1;

        // make sure list1 always points to smallest node
        if (list1.val > list2.val) {
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        // create a pointer which will point to l1 intially, and later retuen the head of the merged list
        ListNode result = list1;

        while (list1 != null && list2 != null) {
            ListNode temp = null;
            while (list1 != null && list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            }

            temp.next = list2;
            // swap, since list1 > list2
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        return result;

    }

    // Approach 1
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
    //    if (list1 == null) return list2;
    //    if (list2 == null) return list1;

    //     ListNode dummy = new ListNode();
    //     ListNode tmp = dummy;

    //     if (list1 != null && list2 != null) {
    //         while(list1 != null || list2 != null) {
    //             if (list1 != null && list2 != null && list1.val > list2.val) {
    //                 ListNode node = new ListNode(list1.val);
    //                 list1 = list1.next;
    //                 tmp.next = node;
    //                 tmp = tmp.next;
    //             } else if (list2 != null){
    //                 ListNode node = new ListNode(list2.val);
    //                 list2 = list2.next;
    //                 tmp.next = node;
    //                 tmp = tmp.next;
    //             }
    //         }
    //     }

    //     return dummy.next;

    // }
}