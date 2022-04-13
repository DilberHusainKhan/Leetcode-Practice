
// code to merge k sorted linked list
public class l23 {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        
       class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1== null || list2 == null) return list1 != null?list1 :list2;   
            ListNode c1 = list1,c2 = list2,dummy = new ListNode(-1),prev = dummy;

            while(c1 != null && c2 != null){
                if(c1.val<c2.val){
                    prev.next = c1;
                    c1 = c1.next;
                }else{
                    prev.next = c2;
                    c2 = c2.next;
                }
                prev = prev.next;
            }
               prev.next = (c1 !=null? c1:c2);
               return dummy.next; 
           }
           //----BAD APPROCH----------------
           public ListNode mergeKLists_BAD(ListNode[] lists) {
               if(lists.length == 0) return null;
               ListNode ans = null;
               for(ListNode head : lists){
                   ans = mergeTwoLists(ans, head);
               }
               return ans;
           }
           //---------------Best approch-------------
           public ListNode mergeKLists(ListNode[] lists, int si,int ei){
                if(si == ei)return lists[si];
                int mid = (si+ei)/2;
                ListNode l1  = mergeKLists(lists,si,mid);
                ListNode l2 = mergeKLists(lists,mid+1,ei);
                return mergeTwoLists(l1, l2);
           }
           public ListNode mergeKLists(ListNode[] lists){
               if(lists.length == 0) return null;
               return mergeKLists(lists,0,lists.length-1);
           }
       }
}
