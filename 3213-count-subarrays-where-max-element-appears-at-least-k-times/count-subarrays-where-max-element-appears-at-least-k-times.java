class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int n = nums.length , j = 0 ;
        long ans = 0 ; 
        int max_num = Integer.MIN_VALUE;

        for ( int i = 0 ; i < n ; i++ ) 
            max_num = Math.max( max_num , nums[i] ) ;

        int count = 0 ;
        for( int i = 0 ; i < n ; i++ ) {

            if( max_num == nums[i] ) count++ ; 

            while ( j<=i && count >= k ) {
                
                ans += n - i ; 
                if( nums[j++] == max_num ) count--;

            }

        }
        
        return ans;
    }
}

// 1,  1,1,3,2,3
//  n - ( i - j ) 