class Solution {


    public static int find( int n , Integer[] dp ) {
        
        if( n == 0 ) return 1;
        if( n < 0 ) return 0;

        if( dp[n] != null ) return dp[n];

        int l = 0;
        int r = 0;

        return dp[n] = find( n - 1  , dp ) + find( n - 2  , dp );


    }
    public int climbStairs(int n) {

        int[] dp = new int[n+1]; 
        // return find( n , dp );

        dp[0] = 1 ; dp[1] = 1;

        for ( int i = 2 ; i <= n ; i++ ) {
            dp[i] = dp[ i - 1 ] + dp[ i - 2 ] ;
        }

        return dp[n];
    }
}

