package DSAsheetByArsh.LinkedList;

public class reverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;
        while(  left >1 ){
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        } // To get the tail and the place from where it needs to be connect
        ListNode connect = prev;
        ListNode tail = curr;
        while ( right > 0 ){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            right--;
        }
        if(connect != null) connect.next = prev;
        else head = prev;
        tail.next = curr;
        return head;
    }
}
