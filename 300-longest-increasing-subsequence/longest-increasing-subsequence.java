class Solution { 

    public static int find( int i , int prev , int[] arr , Integer[][] dp ) { 
        
        if ( i < 0 ) return 0;
        if( dp[i][prev+1] != null ) return dp[i][prev+1];

        int take = 0 , ntake = 0 ;
        
        if( prev == arr.length || arr[prev] > arr[i] ) { 
            take= 1 + find( i - 1 , i , arr , dp );
        }

        ntake = 0 + find( i - 1 , prev , arr , dp );
        
        return dp[i][prev+1] = Math.max( take , ntake );

    }

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        Integer[][] dp = new Integer[n][n+2];
        return find( n-1,n,nums,dp );
        
    }
}