package DSAsheetByArsh.Trees;

import java.util.*;

public class populatingNextRightPointersInEachNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        if(root == null) return null;
        root.next =null;
        q.add(root);
        while(!q.isEmpty()){
            int size =q.size();

            while(size > 0){
                Node curr;
                if(size >1){
                    curr = q.remove();
                    Node nextAdd = q.peek();
                    curr.next = nextAdd;
                }
                else {
                    curr = q.remove();
                }

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                size--;
            }
        }
        return root;
    }


}
