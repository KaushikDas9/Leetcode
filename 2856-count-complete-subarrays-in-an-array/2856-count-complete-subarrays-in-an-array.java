class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> de = new HashSet<Integer>();

        for( int i=0;i<nums.length;i++) { de.add(nums[i]); }

        int count=0,j=0;
        HashMap<Integer,Integer> che = new HashMap<>();

        for( int i=0;i<nums.length;i++ ) { 

            che.put(nums[i],che.getOrDefault(nums[i],0)+1 );

            while(  che.size()==de.size()) {
                  
                    count+= nums.length-i ;   
                    che.put(nums[j],che.get(nums[j])-1);
                    che.remove(nums[j],0);
                    j++;
            }
            
        }
        return count;
    }
}