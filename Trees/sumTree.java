package DSAsheetByArsh.Trees;

public class sumTree {
    static class Pair{
        boolean first; //CheckSum
        int second; //Store Sum
        Pair(boolean first, int second){
            this.first = first;
            this.second = second;
        }
    }
    boolean isSumTree(Node root)
    {
        // Your code here
        return isSumTreeFast(root).first;
    }
    Pair isSumTreeFast(Node root){
        if(root == null) {
            return new Pair(true, 0);
        }
        if(root.left == null && root.right== null){
            return new Pair(true, root.data);
        }
        Pair leftAns = isSumTreeFast(root.left);
        Pair rightAns = isSumTreeFast(root.right);

        boolean left = leftAns.first;
        boolean right = rightAns.first;
        boolean condition = root.data == leftAns.second + rightAns.second;
        Pair ans = new Pair(true, 0);
        if(left && right && condition){
            ans.first = true;
            ans.second= 2*root.data;
        }
        else{
            ans.first = false;
        }
        return ans;
    }
}
