package DSAsheetByArsh.String;
import java.util.*;
public class searchPattern {
    static ArrayList<Integer> search(String pat, String s)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = pat.length();
        StringBuilder sb = new StringBuilder();
        while( j <= s.length()) {
            String curr = s.substring(i, j);
            if (curr.equals(pat)) {
                arr.add(i + 1);
            }
            i++;
            j++;
        }
        if(arr.isEmpty()) {
            arr.add(-1);
            return arr;
        }
        return arr;
    }
}
