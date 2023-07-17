package DSAsheetByArsh.Trees;

public class checkForBalancedTree {
    static class Pair {
        boolean first;
        int second;
        Pair(boolean first, int second){
            this.first = first;
            this.second = second;
        }
    }
    boolean isBalanced(Node root)
    {
        return balancedFast(root).first;

    }
    Pair balancedFast(Node node)
    {
        if(node == null){
            Pair p = new Pair(true, 0);
            return p;
        }
        Pair left = balancedFast(node.left);
        Pair right = balancedFast(node.right);

        boolean leftAns = left.first;
        boolean rightAns = right.first;
        boolean diff = Math.abs(left.second - right.second) <=1;
        Pair ans = new Pair(true, 0);
        ans.second = Math.max(left.second, right.second) + 1;

        if(leftAns && rightAns && diff) ans.first = true;
        else
            ans.first = false;
        return ans;
    }
}
