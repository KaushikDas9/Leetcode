class Solution {
    public int majorityElement(int[] nums) {
        
        // List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i=0;i<nums.length;i++ ) { 

            map.put( nums[i] , map.getOrDefault(nums[i],0)+1 );
        } 

        int maxi =-(int)1e9;
        int ans=-1;
        for( Map.Entry<Integer,Integer> entry : map.entrySet() ) { 

            if( entry.getValue() >= maxi  ) { 
                maxi = entry.getValue();
                ans= entry.getKey();

            }
        }   

        return ans;
    }
}