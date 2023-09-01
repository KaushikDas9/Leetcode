class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=0;    
        int sum=0 , ans = Integer.MIN_VALUE;
        for( int i=0;i<nums.length;i++ ) {

            map.put(nums[i] , map.getOrDefault(nums[i],0 )+1 );
            sum += nums[i];
            
            while( map.get(nums[i])>1 ) {
                map.put(nums[j] , map.getOrDefault(nums[j],0 )-1 );
                sum -= nums[j++];
            }
            ans = Math.max(ans,sum);
        }
            return ans;
      
    }
}