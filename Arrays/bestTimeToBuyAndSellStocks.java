package DSAsheetByArsh;

public class bestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        int max =  0;
        int minSoFar= prices[0];
        for(int i = 0; i < prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int diff = prices[i] - minSoFar;
            max = Math.max(diff, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr= {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
