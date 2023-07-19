package DSAsheetByArsh.Trees;
import java.util.*;
public class binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String str = "";
        if(root == null) return list;
        binaryLeaf(root, str, list);
        return list;
    }
    private static void binaryLeaf(TreeNode root,  String str, List<String> list) {
        if(root.left== null && root.right == null){
            list.add(str + root.val);
        }
        if (root.left != null) {
            binaryLeaf(root.left, str + root.val + "->", list);
        }
        if (root.right != null) {
            binaryLeaf(root.right, str + root.val + "->", list);

        }

    }

}
