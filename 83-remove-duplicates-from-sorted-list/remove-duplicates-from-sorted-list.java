class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val) {
                // skip the duplicate node
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
// use while to loop when curr value is equal to next curr value 
// bypass the duplicate by relinking it to next curr
// or move forward