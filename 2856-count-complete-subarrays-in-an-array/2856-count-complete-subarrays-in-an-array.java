class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> de = new HashSet<Integer>();

        for( int i=0;i<nums.length;i++) { de.add(nums[i]); }

        int count=0;
        HashSet<Integer> che = new HashSet<Integer>();

        for( int i=0;i<nums.length;i++ ) { 

            // che.add(nums[i]);
            for(int j=i;j<nums.length;j++ ) {

                che.add(nums[j]);

                if( che.size()==de.size() ) { 

                    count++;
                }
            }
            che.clear();
        }
        return count;
    }
}