package DSAsheetByArsh.LinkedList;

public class removeDuplicatesInSortedArray {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while( head != null ){
            if(head.next != null && head.val == head.next.val){
                while( head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                curr.next =head.next;
            }
            else{
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next.next = new ListNode(5);

        ListNode mergeList= deleteDuplicates(list1);
        while (mergeList != null) {
            System.out.print(mergeList.val + " ");
            mergeList = mergeList.next;
        }
    }
}
