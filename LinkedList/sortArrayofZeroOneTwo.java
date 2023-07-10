package DSAsheetByArsh.LinkedList;

import LinkedList.sortListOfZerOneTwo;

public class sortArrayofZeroOneTwo {
    static ListNode segregate(ListNode head){
        ListNode temp = head;
        int zero = 0;
        int ones = 0;
        int two  = 0;

        while(temp !=null){
            if(temp.val == 1)
                ones++;
            else if(temp.val == 2)
                two++;
            else if(temp.val == 0)
                zero++;
            temp = temp.next;
        }
        temp = head;
        while(zero>0){
            temp.val = 0;
            temp = temp.next;
            zero--;
        }
        while(ones>0){
            temp.val = 1;
            temp = temp.next;
            ones--;
        }
        while(two>0){
            temp.val = 2;
            temp = temp.next;
            two--;
        }
        return head;
    }
}
