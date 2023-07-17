package DSAsheetByArsh.Trees;

public class determineIdenticalTrees {
    boolean isIdentical(Node root1, Node root2)
    {
        if( root1 == null && root2 == null) return true;

        if(root1 == null && root2 != null) return false;

        if(root1 != null && root2 == null) return false;

        boolean left = isIdentical(root1.left, root2.left);
        boolean right = isIdentical(root1.right, root2.right);
        boolean check = root1.data == root2.data;

        if(left && right && check) return true;
        else return false;

    }
}
