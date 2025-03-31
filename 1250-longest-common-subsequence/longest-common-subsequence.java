class Solution {


    public static int find( int i,int j,String s1,String s2,Integer[][] dp ) {

        int n = s1.length();
        int m = s2.length();

        if( i==n || j==m ) return 0;
        if( dp[i][j]!=null ) return dp[i][j];

        int ans=0;
        if( s1.charAt(i) == s2.charAt(j) ) { 
            ans = 1+find(i+1,j+1,s1,s2,dp); 
        } else { 
            ans = 0+ Math.max(find(i+1,j,s1,s2,dp) , find(i,j+1,s1,s2,dp));
        }

        return dp[i][j]=ans;

    } 
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        // return find(0,0,text1,text2,dp);

        for( int i=1;i<=n;i++ ) { 
            for ( int j=1;j<=m;j++  ) { 

                if( text1.charAt(i-1) == text2.charAt(j-1) ) { 
                    dp[i][j] = 1+dp[i-1][j-1];
                } else { 
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }   
        }

        return dp[n][m];

    }
}