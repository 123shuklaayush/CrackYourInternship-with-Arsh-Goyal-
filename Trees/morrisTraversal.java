package DSAsheetByArsh.Trees;

import java.util.ArrayList;

public class morrisTraversal {
    static ArrayList<Integer> inOrder(TreeNode root){
        ArrayList<Integer> arr = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                arr.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }
                else{
                    prev.right = null;
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // Create the tree [4, 6, 7, 10, 12, null, 8, null, null, 1, 13]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(6);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(12);
        root.right.left = null; // Null node
        root.right.right = new TreeNode(8);
        root.left.left.left = null; // Null node
        root.left.left.right = null; // Null node
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(13);

        // Call the inOrder function to get the result
        ArrayList<Integer> result = inOrder(root);

        // Print the result
        System.out.println("In-order traversal result: " + result);
    }
}
