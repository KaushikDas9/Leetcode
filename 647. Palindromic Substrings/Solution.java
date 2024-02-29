class Solution {


    public static int find( String s, int i,int j,Integer dp[][] ) { 

        if( i>= j ) return 1;
        if( dp[i][j] != null ) return dp[i][j];
        if( s.charAt(i) == s.charAt(j) ) return dp[i][j]=find( s,i+1,j-1,dp );

        return dp[i][j]=0 ;
    } 
    public int countSubstrings(String s) {
        
        int count =0;
        int n =s.length();
        Integer dp[][] = new Integer[n+1][n+1];
        for( int i=0;i<s.length();i++ ) { 

            for( int j=i;j<s.length();j++ ) {
                 if( find( s,i,j,dp ) == 1 ) count++ ;
            }
        } 
        return count;
    }
}