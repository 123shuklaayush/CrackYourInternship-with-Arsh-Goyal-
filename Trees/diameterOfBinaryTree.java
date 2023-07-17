package DSAsheetByArsh.Trees;

public class diameterOfBinaryTree {
    static class Pair {
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int diameterOfBinaryTree(Node root) {
        return diameterFast(root).first;
    }
    Pair diameterFast(Node root){
        if(root == null) {
            Pair p = new Pair(0, 0);
            return p;
        }
        Pair left = diameterFast(root.left);
        Pair right = diameterFast(root.right);
        int op1 = left.first;
        int op2 = right.first;
        int op3 = left.second + right.second+1;
        Pair ans = new Pair(0, 0);
        ans.first = Math.max(op1, Math.max(op2, op3));
        ans.second = Math.max(left.second, right.second)+1;
        return ans;
    }

}
