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

        Integer[][] dp = new Integer[n][m];
        return find(0,0,s,t,dp);        
    }
}