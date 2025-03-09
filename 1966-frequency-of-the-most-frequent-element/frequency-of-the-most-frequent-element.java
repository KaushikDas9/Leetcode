class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int ans=0;int j=0;long cur=0;
        for( int i=0;i<n;i++) {
            
            long tar = nums[i];
            cur += tar ;

            while( (i-j+1)*tar - cur > k ) {
                cur -= nums[j++];
            }

            ans = Math.max(ans,(i-j+1) );
        }

        return ans;
    }
}