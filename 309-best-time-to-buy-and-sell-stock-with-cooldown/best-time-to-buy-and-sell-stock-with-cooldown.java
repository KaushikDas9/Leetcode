class Solution {

     public static int find( int n,int[] arr, int buy,int c, int[][] dp  ) { 
        
        if( n>=arr.length ) return 0;
        if( dp[n][buy]!=-1 ) return dp[n][buy];

        int profit=0;
        if( buy==1 ) { 

            profit = Math.max( find( n+1,arr,0,c,dp )-arr[n],
                                find( n+1,arr,1,c,dp )+0 );
        } else { 
            profit = Math.max( find( n+c,arr,1,c,dp )+arr[n],
                   find( n+1,arr,0,c,dp )+0 );
        }
        return dp[n][buy]=profit;

    }

    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[][] dp = new int[n][2]; 
        for (int[] row : dp) Arrays.fill(row, -1);
        return find(0,prices,1,2,dp);
    }
}