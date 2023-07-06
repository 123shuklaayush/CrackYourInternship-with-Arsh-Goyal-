package DSAsheetByArsh.String;

import java.util.Arrays;

public class longestCommonPrefix {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length-1];
            StringBuilder sb = new StringBuilder();
            int i = 0, j = 0;
            if(strs.length == 1) return strs[0];
            while(j != first.length() && i != last.length() && first.charAt(i) == last.charAt(j) ){
                sb.append(first.charAt(i));
                i++;
                j++;
            }
            return sb.toString();
        }
}
