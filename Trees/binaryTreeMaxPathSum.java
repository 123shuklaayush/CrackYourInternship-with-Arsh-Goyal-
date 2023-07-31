package DSAsheetByArsh.Trees;

public class binaryTreeMaxPathSum {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root ==  null) return 0;
        helper(root);
        return result;
    }
    int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        int Straight_path=Math.max(Math.max(left,right)+root.val,root.val);
        int all_Maxval=Math.max(Straight_path,left+right+root.val);
        result = Math.max(all_Maxval, result);
        return Straight_path;
    }
}
