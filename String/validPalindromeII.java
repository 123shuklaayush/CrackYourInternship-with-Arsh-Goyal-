package DSAsheetByArsh.String;

public class validPalindromeII {
    public boolean validPalindrome(String s) {
        char[] c =s.toCharArray();
        int i = 0, j = s.length()-1;
        for( ; i < j; i++ ,j--){
            if(c[i] != c[j]){
                if(isPalin(c, i+1, j)) {
                    return true;
                }
                if(isPalin(c, i, j-1))
                    return true;
                return false;
            }
        }
        return true;
    }
    public boolean isPalin (char[] c, int start, int end){
        while(start < end){
            if( c[start] !=c[end] ) return false;
            start+=1;
            end-=1;
        }
        return true;
    }
}
