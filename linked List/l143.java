public class l143 {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public void reorderList(ListNode head) {
        if(head == null ||  head.next == null) return;    
    }
}
