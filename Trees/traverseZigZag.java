package DSAsheetByArsh.Trees;

import java.util.*;

public class traverseZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean check = true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode n = q.poll();
                int idx;
                if(check) idx = i;
                else idx = size-i-1;
                curr.set(idx, n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            check = !check;
            list.add(curr);
        }
        return list;
    }
}
