package DSAsheetByArsh.Trees;

import java.util.*;

public class rightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(root, arr, 0);
        return arr;
    }
    void helper(TreeNode root, List<Integer> arr, int level){
        if(root == null) return;
        if( level == arr.size() ){
            arr.add(root.val);
        }
        if(root.right != null){
            helper(root.right, arr, level+1);
        }
        if(root.left != null){
            helper(root.left, arr, level+1);
        }
    }
}
