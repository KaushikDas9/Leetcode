class Solution {
     public static int find( String s1 , String s2 , int n , int m,int[][] dp )
    {
            if( n<0 || m<0 ) return 0;
            if( dp[n][m] != -1 )  return dp[n][m];
            if( s1.charAt(n) == s2.charAt(m) ) return 1+ find(s1,s2,n-1,m-1,dp);

            return dp[n][m] = Math.max(find(s1,s2,n-1,m,dp),find(s1,s2,n,m-1,dp));
    }
    public int minDistance(String word1, String word2) {
        //  String s2="";
        int n = word1.length();
         int m = word2.length();
        // for( int i=s.length()-1 ; i>=0; i--) { s2 += String.valueOf(s.charAt(i)); }
        int[][] dp = new int[n][m];
        for( int i=0 ; i<n ; i++ ) { Arrays.fill(dp[i],-1); }
        int ans= find(word1,word2,n-1,m-1,dp);
        return  n-ans+m-ans;
    }
}