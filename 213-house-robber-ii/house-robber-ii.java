class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if( n==1 ) return nums[0];
        
        if( n == 2 ) return Math.max(nums[0] , nums[1]);
        if( n == 3 ) return  Math.max((Math.max(nums[1] , nums[2])) , (Math.max(nums[0] , nums[1])));

        int prev1 = nums[0];
        int curr1 = Math.max(nums[0] , nums[1]);

        for( int i = 2; i < n - 1; i++ ) {

            int t = nums[i] + prev1;
            int nt = curr1;

            prev1 = curr1;
            curr1 = Math.max(t , nt);
        }

        // base case
        int prev2 = nums[1];
        int curr2 = Math.max(nums[1] , nums[2]);

        for( int i = 3; i < n; i++ ) {

            int t = nums[i] + prev2;
            int nt = curr2;

            prev2 = curr2;
            curr2 = Math.max(t , nt);

        }

        return Math.max(curr1 , curr2);
    }

}