package DSAsheetByArsh.Trees;

public class minimumAbsoluteDifferenceInBST {
    static TreeNode prev = null;
    static int min = Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root) {
        inorder(root, prev);
        return min;
    }
    public static void inorder(TreeNode root, TreeNode prev){
        if(root == null){
            return;
        }
        inorder(root.left, prev);
        if(prev != null){
            min = Math.min(min, root.val-prev.val);
        }
        prev = root;
        inorder(root.right, prev);
    }
}
