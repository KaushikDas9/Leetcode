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

        Integer[][] dp = new Integer[n][m];
        return find(0,0,word1,word2,dp);
    }
}