class Solution {


    public static int find( int n,int[] dp ) { 

        if( n<0 ) return 0;
        if( n == 0 ) return 1;
        if( dp[n]!=-1 ) return dp[n];
        return dp[n]=find(n-1,dp)+find(n-2,dp);

    }
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return find(n,dp);
    }
}