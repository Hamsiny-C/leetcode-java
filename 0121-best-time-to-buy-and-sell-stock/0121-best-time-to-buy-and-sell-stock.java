class Solution {
    public int maxProfit(int[] prices) {
       int minP=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int i=0;i<prices.length;i++){
        if(prices[i]<minP){
            minP=prices[i];
        }
        else{
            int profit=prices[i]-minP;
            if(profit>maxProfit){
            maxProfit=profit;
        }
        }
       }
       return maxProfit;
    }
}