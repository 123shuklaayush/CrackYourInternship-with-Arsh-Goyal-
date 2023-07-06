package DSAsheetByArsh.String;

public class reverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        for(int i = str.length-1; i>=0; i--){
            sb.append(str[i] + " ");
        }
        return sb.toString();
    }
}
