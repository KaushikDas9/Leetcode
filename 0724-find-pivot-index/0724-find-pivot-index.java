class Solution {
    public int pivotIndex(int[] nums) {
         int t_sum=0;
        for(int i=0 ;i<nums.length ;i++)
        {
            t_sum += nums[i];
        }
        int c_sum=0;
        for(int i=0 ;i<nums.length ;i++)
        {
            if(c_sum == (t_sum - c_sum -nums[i])) return i;
              c_sum += nums[i];  
        }

        return -1;
    }
}