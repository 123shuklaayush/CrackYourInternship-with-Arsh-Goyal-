package DSAsheetByArsh.Trees;

public class rangeSumofBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root, low, high);
    }
    static int helper(TreeNode root, int low, int high){
        if( root == null ) return 0;

        if(root.val > high) return helper(root.left, low, high);
        if(root.val < low) return helper(root.right, low, high);
        return root.val+ helper(root.left, low, high) + helper(root.right, low, high);
    }
}
