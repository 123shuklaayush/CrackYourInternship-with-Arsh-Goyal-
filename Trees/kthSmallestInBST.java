package DSAsheetByArsh.Trees;

public class kthSmallestInBST {
    int result = -1;
    int curr = 0;
    public int kthSmallest(TreeNode root, int k) {
        int curr = 0;
        helper(root, k);
        return result;
    }
    public void helper(TreeNode root, int k){
        if(root == null) return;

        helper(root.left, k);
        curr = curr+1;

        if(k == curr){
            result = root.val;
            return;
        }
        helper(root.right, k);
    }
}
