package DSAsheetByArsh.LinkedList;

public class mergeKsortedLists {
    ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode merge (ListNode left,ListNode right){
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        ListNode ans = new ListNode(1);
        ListNode temp=ans;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                temp=left;
                left=left.next;
            }
            else{
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }
        while(left!=null){
            temp.next=left;
            temp=left;
            left=left.next;
        }
        while(right!=null){
            temp.next=right;
            temp=right;
            right=right.next;
        }
        ans=ans.next;
        return ans;
    }
    ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right = mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        ListNode result=merge(left,right);

        return result;

    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i  =0; i< lists.length; i++){
            while(lists[i] != null){
                curr.next = lists[i];
                curr = curr.next;
            }
        }
        return sortList(dummy.next);
    }

}
