class Solution {
     public static int find( String s1 , String s2 , int n , int m,int[][] dp )
    {
            if( n<0 || m<0 ) return 0;
            if( dp[n][m] != -1 )  return dp[n][m];
            if( s1.charAt(n) == s2.charAt(m) ) return 1+ find(s1,s2,n-1,m-1,dp);

            return dp[n][m] = Math.max(find(s1,s2,n-1,m,dp),find(s1,s2,n,m-1,dp));
    }
    public int minDistance(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        // for( int i=0 ; i<n ; i++ ) { Arrays.fill(dp[i],-1); }

        // int ans= find(word1,word2,n-1,m-1,dp);

        for( int i=1;i<=n;i++ ) { 
            for ( int j=1;j<=m;j++ ) { 

                if( word1.charAt(i-1) == word2.charAt(j-1) ) 
                    dp[i][j] =  1+ dp[i-1][j-1];
                else 
                    dp[i][j] = Math.max( dp[i-1][j],dp[i][j-1] );
            }
        }


        return  n+m-(2*dp[n][m]);

    }
}