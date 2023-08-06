class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int tsum=0;
        for(int i=0 ;i<nums.length;i++)
        {
            tsum += nums[i];
        }
        int rs =0 ;
        int[] ans = new int[nums.length];
        for(int i=0 ; i<nums.length; i++)
        {
            tsum -= nums[i];
            ans[i] = Math.abs(tsum-rs);
            rs += nums[i];
        }
        return ans;

    }
}