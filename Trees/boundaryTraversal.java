package DSAsheetByArsh.Trees;

import java.util.ArrayList;

public class boundaryTraversal {
    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> arr =new ArrayList<>();
        if(node ==null) return arr;
        arr.add(node.data);
        printLeft(node.left, arr);
        printLeaf(node.left, arr);
        printLeaf(node.right, arr);
        printRightReverse(node.right, arr);
        return arr;
    }

    // TO PRINT THE LEFT PART OF TREE
    static void printLeft(Node node, ArrayList<Integer> arr){
        if((node == null) || (node.left == null && node.right == null))
            return;

        arr.add(node.data);

        if(node.left != null)
            printLeft(node.left, arr);
        else
            printLeft(node.right, arr);
    }

    // TO PRINT THE LEAF NODE OF THE TREE
    static void printLeaf(Node node, ArrayList<Integer> arr){
        if( node == null ) return;
        if(node.left == null && node.right == null){
            arr.add(node.data);
            return;
        }

        printLeaf(node.left, arr);
        printLeaf(node.right, arr);
    }

    // TO PRINT THE RIGHT PART OF TREE IN REVERSE ORDER
    static void printRightReverse(Node node, ArrayList<Integer> arr){
        if((node == null) || (node.left == null && node.right == null))
            return;

        if(node.right != null){
            printRightReverse(node.right, arr);
        }
        else
            printRightReverse(node.left, arr);

        arr.add(node.data);
    }
}
