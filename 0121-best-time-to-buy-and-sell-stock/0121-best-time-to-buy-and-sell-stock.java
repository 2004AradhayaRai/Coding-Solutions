class Solution {
    
    public int maxProfit(int[] prices) {

        int profit=0;
        int n=prices.length;
        int cp=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            else{
                profit=Math.max(profit,prices[i]-cp);
            }
        }
        return profit;
    }
}