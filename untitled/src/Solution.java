

class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l3 = new ListNode(0);

        ListNode l = l3;
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



    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l = mergeTwoLists(l1, l2);
        System.out.println(l.val);
    }
}