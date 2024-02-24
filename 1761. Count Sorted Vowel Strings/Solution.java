class Solution {

    public static int find( int i,int n,String[] arr,Integer dp[][] ) { 

        if( n==0 ) return 1;
        if( i >= arr.length ) return 0;
        if( dp[i][n] != null ) return dp[i][n];

        int take= find( i,n-1,arr,dp );
        int ntake= find( i+1,n,arr,dp );

        return dp[i][n] = take+ ntake;


    }
    public int countVowelStrings(int n) {

        String arr[] = new String[]{"a","e","i","o","u"} ; 
        Integer dp[][] = new Integer[5][n+1];
       return  find( 0,n,arr,dp );
    }
}