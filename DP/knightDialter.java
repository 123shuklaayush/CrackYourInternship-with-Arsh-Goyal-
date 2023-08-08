package DSAsheetByArsh.DP;

public class knightDialter {
    int mod = 1000000007;

    public int knightDialer(int n) {
        long s = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                s = (s + paths(i, j, n)) % mod;
            }
        }
        return (int) s;
    }


    public long paths(int i, int j, int n) {
        // if the knight hops outside of the matrix or to * return 0
        //as there are no unique paths from here
        if(i < 0 || j < 0 || i >= 4 || j >= 3 || (i == 3 && j != 1)) return 0;
        //trivial case
        if(n == 1) return 1;
        //non trivial case
        long s = paths(i - 1, j - 2, n - 1) % mod + // jump to a
                paths(i - 2, j - 1, n - 1) % mod + // jump to b
                paths(i - 2, j + 1, n - 1) % mod + // jump to c
                paths(i - 1, j + 2, n - 1) % mod + // jump to d
                paths(i + 1, j + 2, n - 1) % mod + // jump to e
                paths(i + 2, j + 1, n - 1) % mod + // jump to f
                paths(i + 2, j - 1, n - 1) % mod + // jump to g
                paths(i + 1, j - 2, n - 1) % mod; // jump to h
        return s;
    }
}
