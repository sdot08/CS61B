/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l;
        if (l1.val<l2.val){
            l = new ListNode(l1.val);
            l1 = l1.next;
        }
        else {
            l = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode l3 = l;
        l3=l3.next;
        while (l1 != null && l2 != null){
            if (l1.val<l2.val) {
                l3 = new ListNode(l1.val);
                l1 = l1.next;
                l3 = l3.next;
            }
            else {
                l3 = new ListNode(l2.val);
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        while (l1 != null) {
            l3 = new ListNode(l1.val);
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            l3 = new ListNode(l2.val);
            l3 = l3.next;
            l2 = l2.next;
        }
        return l;
    }
}