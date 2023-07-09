package DSAsheetByArsh.MathematicalProblems;

public class reverseInteger {
    public static int reverse(int x) {
        long ans = 0;

        long c = x;
        while(c != 0){
            long rem = c % 10;
            ans = ans * 10 + rem;
            c = c/10;
        }
        if(ans <= Integer.MAX_VALUE && ans >= Integer.MIN_VALUE) return (int) ans;
        return 0;

    }
}
