package DSAsheetByArsh.Trees;

public class countBSTThatLieInGivenRange {
    int count = 0;
    int getCount(Node root,int l, int h)
    {
        //Your code here
        helper(root, l, h);
        return count;
    }
    void helper(Node root, int l, int h){
        if(root == null) return;

        helper(root.left, l, h);

        if(root.data >= l && root.data <= h){
            count++;
        }

        helper(root.right, l, h);

    }
}
