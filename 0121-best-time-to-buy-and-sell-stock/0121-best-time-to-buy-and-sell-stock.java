class Solution {

     public static int find(int n,int min,int ans,int[] prices,int dp[]) {
        if(n==prices.length) return ans ;
        if(dp[n] != -1) return dp[n];
        min = Math.min(prices[n], min);
        ans=Math.max( (prices[n]- min ) , ans );
        return dp[n]=find(n+1, min, ans, prices,dp);

    }
    public int maxProfit(int[] prices) {
        
        int dp[] = new int[prices.length];
        Arrays.fill(dp,-1);
        return find(0,Integer.MAX_VALUE,0,prices,dp);
    }
}