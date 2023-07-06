package DSAsheetByArsh.String;

import java.util.*;

public class removeAllDuplicatesInString {
    String removeDuplicates(String str) {
        // code here
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
