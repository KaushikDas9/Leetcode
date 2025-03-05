class Solution {


    public static int find( int n,int[] nums,int[] dp  ) { 
        
        if( n<0 ) return 0;
        if( n==0 ) return nums[0];
        if( dp[n]!=-1 ) return dp[n];


        int a = 0,b=0;

         b = find( n-1,nums,dp ) ;
         a = find( n-2,nums,dp )+nums[n] ;
        

        return dp[n] = Math.max(a,b);
    }
    public int rob(int[] nums) {
        
        int n= nums.length;
        int[] dp = new int[n];
        if( n==1 ) return nums[0];
        if( n==2 ) return Math.max(nums[0],nums[1]);

        Arrays.fill(dp,-1);
        
        return find(n-1,nums,dp);


    }
}