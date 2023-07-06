package DSAsheetByArsh.String;

import java.util.*;

public class smallestWindowInAString {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer>  map2 = new HashMap<>();
        String ans = "";
        for(int i = 0;i < t.length(); i++){
            char ch = t.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) +1 );
        }
        int matchCount = 0;
        int desiredMatchCount = t.length();

        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = -1, j=-1;
        while(true) {
            boolean f1 = false;
            boolean f2 = false;
            //Acquire
            while (i < s.length() - 1 && matchCount < desiredMatchCount) {
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchCount++;
                }
                f1 = true;
            }
            // Release and get answer
            while (j < i && matchCount == desiredMatchCount) {
                String pans = s.substring(j + 1, i + 1);
                if (ans.length() == 0 || pans.length() < ans.length())
                    ans = pans;
                j++;
                char ch = s.charAt(j);

                if (map1.get(ch) == 1) {
                    map1.remove(ch);
                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }
                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    matchCount--;
                }
                f2 = true;
            }
            if(f1 == false && f2 == false)
                break;
        }
        return ans;
    }
}
