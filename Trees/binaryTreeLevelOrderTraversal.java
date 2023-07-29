package DSAsheetByArsh.Trees;
import java.util.*;
public class binaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null) return list;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size = q.size();
            while(size != 0){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                arr.add(curr.val);
                size--;
            }
            list.add(new ArrayList<>(arr));
        }
        return list;
    }
    public static void main(String[] args) {
        // Test case root = [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}
