package DSAsheetByArsh.Trees;

import java.util.Stack;

public class partitionBTtoLL {
    public void flatten(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        if(root == null) return;
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.right != null)
                st.add(curr.right);
            if(curr.left != null)
                st.add(curr.left);

            if(!st.isEmpty()){
                curr.right = st.peek();
            }
            curr.left = null;
        }
    }
}
