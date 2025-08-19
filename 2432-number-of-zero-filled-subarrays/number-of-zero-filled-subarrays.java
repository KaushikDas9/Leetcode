class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zero = 0 ;
        long ans = 0;
        int n = nums.length ;

        for ( int i = 0 ; i < n ; i++ ) {
            if( nums[i] == 0 ) zero++;
            else {                
                ans += ( zero * ( zero + 1 )) / 2  ;
                zero = 0;
            }
        }

        ans += ( zero * ( zero + 1 )) / 2  ;
        return ans ;
    }
}

//[1,3,0,0,2,0,0,4]
// 2n + 1

