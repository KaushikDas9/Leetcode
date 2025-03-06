class Solution {
    // 

    public static int find( int n,int[] arr,int b,int c,Integer[][][] dp ) { 
        
        if( c==0 || n==arr.length ) return 0;
        if( dp[n][b][c] != null ) return dp[n][b][c];

        int p =0;
        if( b==1 ) { 
            p = Math.max( (-arr[n]+find(n+1,arr,0,c-1,dp)) , (0+find(n+1,arr,1,c,dp)) );
        } else { 
            p = Math.max( (+arr[n]+find(n+1,arr,1,c-1,dp)) , (0+find(n+1,arr,0,c,dp))  );
        }

        return dp[n][b][c]=p;

    }
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        Integer[][][] dp = new Integer[n][2][5];
        return find(0,prices,1,4,dp);

    }
}