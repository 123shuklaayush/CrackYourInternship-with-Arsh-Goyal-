package DSAsheetByArsh.StacksAndQueues;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class removeAllAdjancentDuplicatesInStringII {
    public static String removeDuplicates(String s, int k) {
        int i = 0;
        int n = s.length();
        int[] count = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
            if (i > 0 && stack[i - 1] == stack[j]) {
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = 1;
            }
            if (count[i] == k)
                i -= k;
        }
        return new String(stack, 0, i);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }
}
