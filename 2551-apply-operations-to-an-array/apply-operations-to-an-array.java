class Solution {

    // t-O(N)
    // s-O(N)
    public int[] applyOperations(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int j=0;
        for ( int i=0;i<n-1;i++ ) {
            if( nums[i] != nums[i+1] ) {
                if( nums[i]!=0 ) ans[j++]=nums[i];
            }
            else { 
                if( nums[i]!=0 ) ans[j++]=nums[i]*2; 
                nums[i+1]=0;
            }
        }

        if ( nums[n-1]!=0 ) ans[j++]=nums[n-1];

        return ans;
    }
}