// 19. Remove Nth Node From End of List
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode slow = dum;
        ListNode fast = dum;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dum.next;
    }
}



// 160. Intersection of Two Linked Lists
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}