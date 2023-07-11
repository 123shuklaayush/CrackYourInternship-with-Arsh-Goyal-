package DSAsheetByArsh.LinkedList;

public class palindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode revCurr = reverse(mid.next);
        while(revCurr != null){
            if(head.val != revCurr.val) return false;
            head = head.next;
            revCurr = revCurr.next;
        }
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
