class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int n = nums.length , pro = 1 , count = 0 ,j = 0;

        for( int i=0 ; i<n ; i++ ) {

            pro *= nums[i];

            while( j <= i && pro >= k ) {
                pro /= nums[j++];
            }
                count += i-j+1;
        }    

            return count;
    }
}