package DSAsheetByArsh.LinkedList;

public class addTwoNumbersII {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while ( head1 != null || head2 != null || carry ==1){
            int sum = 0;
            if( head1 != null ){
                sum += head1.val;
                head1 = head1.next;
            }
            if ( head2 != null ){
                sum += head2.val;
                head2 = head2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
        }
        return reverse(dummy.next);
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while( curr != null ){
            ListNode temp = curr.next;
            curr.next = prev;
            prev =  curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(7);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(3);


        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode mergeList= addTwoNumbers(list1, list2);
        while (mergeList != null) {
            System.out.print(mergeList.val + " ");
            mergeList = mergeList.next;
        }
    }
}
