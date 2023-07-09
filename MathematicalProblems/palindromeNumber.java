package DSAsheetByArsh.MathematicalProblems;

public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        String str =  Integer.toString(x);
        int i = 0, j = str.length()-1;
        while( j > i ){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
