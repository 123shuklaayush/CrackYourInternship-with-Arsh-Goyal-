package DSAsheetByArsh.String;

import java.util.Stack;

public class simplifyPaths {
    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] ans = path.split("/+");
        for (int i = 0; i < ans.length; i++) {
            if (ans[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            } else if (!ans[i].equals(".") && !ans[i].equals("/") && !ans[i].equals(""))
                st.push(ans[i]);
        }
        StringBuilder sb = new StringBuilder();
        if (st.isEmpty()) {
            sb.append("/");
        }
        else{
        while (!st.isEmpty()) {
                sb.insert(0, st.pop());
                sb.insert(0, "/");
            }
        }
        return sb.toString();
    }


        public static void main(String[] args) {
        String path = "/home//foo";
        System.out.println(simplifyPath(path));
    }
}
