package DSAsheetByArsh.LinkedList;

public class mergeKsortedLists {
    public static ListNode merge(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        while(left != null){
            temp.next = left;
            temp = left;
            left = left.next;
        }
        while(right != null){
            temp.next = right;
            temp = right;
            right = right.next;
        }
        return ans.next;
    }
    public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);
        return merge(left,right);
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int i= 0; i< lists.length;i++){
            temp.next = lists[i];
            while (temp.next != null){
                temp = temp.next;
            }
        }
        dummy.next = sortList(dummy.next);
        return dummy.next;
    }
    public static void main(String[] args) {
            // Creating the ListNode array
            ListNode[] listNodes = new ListNode[3];

            // Creating the first ListNode [1, 4, 5]
            ListNode node1 = new ListNode(1);
            node1.next = new ListNode(4);
            node1.next.next = new ListNode(5);
            listNodes[0] = node1;

            // Creating the second ListNode [1, 3, 4]
            ListNode node2 = new ListNode(1);
            node2.next = new ListNode(3);
            node2.next.next = new ListNode(4);
            listNodes[1] = node2;

            // Creating the third ListNode [2, 6]
            ListNode node3 = new ListNode(2);
            node3.next = new ListNode(6);
            listNodes[2] = node3;
        ListNode mergeList= mergeKLists(listNodes);
        while (mergeList != null) {
            System.out.print(mergeList.val + " ");
            mergeList = mergeList.next;
        }
    }
}
