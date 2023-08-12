class Solution {

     public static int find(int n,int min,int ans,int[] prices) {
        if(n==prices.length) return ans ;

        min = Math.min(prices[n], min);
        ans=Math.max( (prices[n]- min ) , ans );
        return find(n+1, min, ans, prices);

    }
    public int maxProfit(int[] prices) {
        
         return find(0,Integer.MAX_VALUE,0,prices);
    }
}