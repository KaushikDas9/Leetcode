class Solution {

    public static int find( int i,int j,String s1, String s2,Integer[][] dp ) { 
        
        if( j>=s2.length() ) return 1;
        if( i>=s1.length() ) return 0;
        if( dp[i][j] != null ) return dp[i][j];

        int ans=0;
        if( s1.charAt(i)==s2.charAt(j) ) {
            ans = find( i+1,j+1,s1,s2,dp ) + find( i+1,j,s1,s2,dp );
        } else { 
            ans = find( i+1,j,s1,s2,dp );
        }

        return dp[i][j]=ans;
    }
    public int numDistinct(String s, String t) {

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        // return find(0,0,s,t,dp);
        for (int i = 0; i <= n; i++) dp[i][0] = 1;
        
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) { 
                int ans=0;
                if(s.charAt(i - 1) == t.charAt(j - 1) ) {
                    ans = dp[i - 1][j - 1] + dp[i - 1][j];
                } else { 
                    ans = dp[i - 1][j];
                }
                dp[i][j] = ans;
            }
        }

        return dp[n][m];
    }
}