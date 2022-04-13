import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class l876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }
    // solution belong to n/2 as mid node for even case
    public ListNode middleNode1(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast  = head;
        ListNode slow = head;
        while(fast.next !=null && fast.next.next !=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Leet code ;- if mid node is mid+1 according to leet code for even number of node; solution belong to n/2+1 as mid node for even case
    public ListNode middleNode(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}