package DSAsheetByArsh.LinkedList;

public class removeNthNodeFromLL {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }

        public static void main(String[] args) {
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode mergeList= removeNthFromEnd(list2, n);
        while (mergeList != null) {
            System.out.print(mergeList.val + " ");
            mergeList = mergeList.next;
        }
    }
}
