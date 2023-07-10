package DSAsheetByArsh.LinkedList;

public class middleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        // Find the length;
        int length = 0;
        while(curr != null ){
            length++;
            curr = curr.next;
        }
        curr = head;
        int mid = length/2;
        while(mid != 0){
            curr = curr.next;
            mid--;
        }
        return curr;

    }
}
