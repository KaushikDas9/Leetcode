class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // Non optimized
        int n = nums.length;
        int count = n/3;
        List<Integer> ans = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for ( int i=0;i<n;i++ ) {
            map.put( nums[i],map.getOrDefault(nums[i],0)+1 );
        }

        for ( Map.Entry<Integer,Integer> entry: map.entrySet() ) {
            if(entry.getValue()>count) ans.add(entry.getKey());
        }

        return ans;
    }
}