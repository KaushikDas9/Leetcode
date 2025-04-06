class Solution {

    public static int find( int i,int j,String s1, String s2,Integer[][] dp ) { 
        
        if (i >= s1.length()) return s2.length() - j;
        if (j >= s2.length()) return s1.length() - i;

        if (dp[i][j] != null) return dp[i][j];

        if( s1.charAt(i) == s2.charAt(j)) { 
            return dp[i][j] = 0 + find(i + 1,j + 1,s1,s2,dp);
        }

        return dp[i][j] = 1 + Math.min( find(i + 1,j,s1,s2,dp), 
                            Math.min( find(i,j + 1,s1,s2,dp),find(i + 1,j + 1,s1,s2,dp) ) );

    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n+1][m+1];
        // return find(0,0,word1,word2,dp);
        for(int i = 0; i <= n; i++ ) dp[i][0] = i;
        for(int j = 0; j <= m; j++ ) dp[0][j] = j;

        for(int i = 1; i <= n; i++ ) { 
            for(int j = 1; j <= m; j++ ) { 
                if( word1.charAt(i-1) == word2.charAt(j-1)) { 
                    dp[i][j] = 0 + dp[i-1][j-1];
                }else {
                        dp[i][j] = 1 + Math.min( dp[i-1][j], 
                            Math.min( dp[i][j-1],
                                        dp[i-1][j-1] ) );
                    }
            }
        }

        return dp[n][m];
    }
}