class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if( n==1 ) return nums[0];
        // return Math.max(find(0 , - 2 , nums , n - 1) , find(1 , - 2 , nums , n ));
        
        if( n == 2 ) return Math.max(nums[0] , nums[1]);
        if( n == 3 ) return  Math.max((Math.max(nums[1] , nums[2])) , (Math.max(nums[0] , nums[1])));


        // step 1 :
        int[] dp1 = new int[n];

        // base case
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0] , nums[1]);

        for( int i = 2; i < n - 1; i++ ) {

            int t = nums[i] + dp1[i - 2];
            int nt = dp1[i - 1];

            dp1[i] = Math.max(t , nt);
        }

        int[] dp2 = new int[n];

        // base case
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1] , nums[2]);

        for( int i = 3; i < n; i++ ) {

            int t = nums[i] + dp2[i - 2];
            int nt = dp2[i - 1];

            dp2[i] = Math.max(t , nt);
        }

        return Math.max(dp1[n-2] , dp2[n-1]);
    }

    // public static int find( int n , int[] arr , Integer[] dp) {

    //     // base case
    //     if( n >= arr.length ) return 0;

    //     // check hit 
    //     if(dp[n] != null) return dp[n]; 


    //     int take = arr[n] + find(n + 2 , arr ,dp);

    //     int ntake = 0 + find(n + 1 , arr ,dp);

    //     return dp[n] = Math.max(take , ntake);

    // }
}