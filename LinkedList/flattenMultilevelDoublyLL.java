package DSAsheetByArsh.LinkedList;
import java.util.*;

public class flattenMultilevelDoublyLL {
    public Node flatten(Node head) {
        Stack<Node> st = new Stack<>();
        Node curr = head;
        while( curr != null || !st.isEmpty()){
            if(curr.child != null){
                st.push(curr);
                curr = curr.child;
            }
            if(curr.next == null){
                curr.next = st.pop();
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
