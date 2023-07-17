package DSAsheetByArsh.Trees;

public class symmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        boolean travLeft = helper(root1.left, root2.right);
        boolean travRight = helper(root1.right, root2.left);
        boolean check = root1.val == root2.val;
        if(check && travLeft && travRight) return true;
        else return false;
    }
}
