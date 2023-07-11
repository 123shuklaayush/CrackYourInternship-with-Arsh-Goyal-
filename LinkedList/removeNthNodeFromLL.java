package DSAsheetByArsh.LinkedList;

public class removeNthNodeFromLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode revCurr = reverse(head);
        ListNode rev = revCurr;
        int count = 1;
        while( rev != null ){
            if( count == n ){
                rev.next = rev.next.next;
            }
            else rev = rev.next;
            count++;
        }
        ListNode reverse = reverse(revCurr);
        return reverse;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = head;
        while( curr != null ){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
