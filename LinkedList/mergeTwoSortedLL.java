package DSAsheetByArsh.LinkedList;

public class mergeTwoSortedLL {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while( curr1 != null && curr2 != null){
            if(curr1.val > curr2.val){
                temp.next = curr2;
                curr2= curr2.next;
            }
            else{
                temp.next = curr1;
                curr1 = curr1.next;
            }
            temp = temp.next;
        }
        if(curr1 != null) {
            temp.next = curr1;
            curr1 = curr1.next;
        }
        if(curr2 != null){
            temp.next = curr2;
            curr2 = curr2.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = new ListNode(5);
        list2.next.next.next.next.next = new ListNode(6);
        list2.next.next.next.next.next.next = new ListNode(7);


        ListNode mergedList = mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
