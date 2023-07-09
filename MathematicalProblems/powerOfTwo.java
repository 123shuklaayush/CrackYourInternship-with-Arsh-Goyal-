package DSAsheetByArsh.MathematicalProblems;

public class powerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if( n <= 0) return false;
        if( n == 1 ) return true;
        int ans = n & n-1;
        return ans ==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(8 & 7);
    }
}
