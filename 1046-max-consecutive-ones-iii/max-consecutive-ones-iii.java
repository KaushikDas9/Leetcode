class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int ans=0,z=0,j=0;
        for( int i=0;i<n;i++ ) { 

            if( nums[i]==0  ) z++;
            while( j<=i && z>k ) { 
                if( nums[j++]==0  ) z--;
            }
            ans = Math.max(ans,i-j+1);
        }   

        return ans;
    }
}