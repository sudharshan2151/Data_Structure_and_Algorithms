class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int pro = 0;
        for(int i=1;i<n;i++){
            int cost = prices[i]-min;
            pro = Math.max(pro,cost);
            min = Math.min(min,prices[i]);
        }
        return pro;
        
    }
}