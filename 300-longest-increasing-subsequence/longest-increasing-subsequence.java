class Solution {

    public static int find( int n,int prev,int[] nums,Integer[][] dp ) { 

        if( n==nums.length ) return 0;
        if( dp[n][prev+1] != null ) return dp[n][prev+1];

        int len=0;
        len= 0+find( n+1,prev,nums,dp );
        if( prev == -1 || nums[prev]<nums[n] ) {
            len=Math.max( len,1+find( n+1,n,nums,dp ) );
        }

        return dp[n][prev+1]=len;

    }
    public int lengthOfLIS(int[] nums) {

        List<Integer> s = new ArrayList<>();
        int n=nums.length;
        Integer[][] dp = new Integer[n+1][n+1];
        return find( 0,-1,nums,dp );

    }
}