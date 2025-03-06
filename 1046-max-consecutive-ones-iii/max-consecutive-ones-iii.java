class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int ans =0;
        for ( int i=0;i<n;i++ ) { 
            int c=0,z=0;
            for ( int j=i;j<n;j++ ) { 
                if( nums[j]==0 && z<k ) { 
                    c++;z++;
                } 
                else if (nums[j]==1 ) c++;
                else if( z==k ) break;
            }
            ans = Math.max(ans,c);
        }

        return ans;
    }
}