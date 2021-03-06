class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return null;
        ListNode result;
        if(l1.val <= l2.val){
            result = new ListNode(l1.val);
            l1 = l1.next;
        }
        else{
            result = new ListNode(l2.val);
            l2 = l2.next;
        }

        while(l1 != null || l2 != null){
            if(l1.val <= l2.val){
                result.next= new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                result.next= new ListNode(l2.val);
                l2 = l2.next;
            }
        }
        return result;

    }
}