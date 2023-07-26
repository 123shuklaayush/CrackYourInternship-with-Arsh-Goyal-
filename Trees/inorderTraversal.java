package DSAsheetByArsh.Trees;
import java.util.*;

public class inorderTraversal {
    public List<Integer> arr = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return arr;
        }
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
        return arr;
    }
}
