package DSAsheetByArsh.LinkedList;

public class partitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode higher = new ListNode(0);
        ListNode lower = new ListNode(0);
        ListNode high = higher;
        ListNode low = lower;
        while( head != null ){
            if( head.val < x ){
                low.next = head;
                low = low.next;
            }
            else{
                high.next = head;
                high = high.next;
            }
            head = head.next;
        }
        high.next = null;
        low.next = higher.next;
        return lower.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(2);
        list1.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next = new ListNode(2);

        ListNode mergeList= partition(list1, 3);
        while (mergeList != null) {
            System.out.print(mergeList.val + " ");
            mergeList = mergeList.next;
        }
    }
}
