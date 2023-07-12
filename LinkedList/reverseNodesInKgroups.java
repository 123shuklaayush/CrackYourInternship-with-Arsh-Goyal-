package DSAsheetByArsh.LinkedList;

public class reverseNodesInKgroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size < k) return head;
        if( head == null) return null;
        ListNode prev= null;
        ListNode next = null;
        ListNode curr = head;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }
}
