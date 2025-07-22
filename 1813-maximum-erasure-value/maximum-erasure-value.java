class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int j=0;    
        int sum=0 , ans = Integer.MIN_VALUE;

        for( int i=0;i<nums.length;i++ ) {
            
            while( set.contains(nums[i]) ) {
                set.remove(nums[j]);
                sum -= nums[j++];
            }
            set.add(nums[i]);
            sum += nums[i];
            ans = Math.max(ans,sum);
        }
            return ans;
      
    }
}