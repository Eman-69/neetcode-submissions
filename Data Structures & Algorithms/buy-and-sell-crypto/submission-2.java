class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=prices[0];
        for(int i:prices)
        {
            minPrice=Math.min(i,minPrice);
            maxProfit=Math.max(i-minPrice,maxProfit);
        }
        return maxProfit;
    }
}
