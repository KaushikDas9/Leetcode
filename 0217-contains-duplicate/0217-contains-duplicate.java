class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> store = new HashMap<>();

        for( int i=0 ; i<nums.length;i++ ) {
            store.put(nums[i], store.getOrDefault(nums[i],0)+1 );
        }
        
        for(Map.Entry<Integer,Integer> entry :store.entrySet()) {
            if(entry.getValue() >1) return true;
        }
        return false;
    }
}