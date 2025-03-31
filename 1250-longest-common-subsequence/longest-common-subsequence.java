class Solution {


    public static int find( int i,int j,String s1,String s2,Integer[][] dp ) {

        int n = s1.length();int m = s2.length();

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

        int n = text1.length();int m = text2.length();
        Integer[][] dp = new Integer[n][m];
        return find(0,0,text1,text2,dp);
    }
}