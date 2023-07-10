package DSAsheetByArsh.LinkedList;

public class convertBinaryToInteger {
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int bin = 0;
        while(curr != null){
            bin = bin *2 + curr.val;
            curr = curr.next;
        }
        return bin;
    }
}
