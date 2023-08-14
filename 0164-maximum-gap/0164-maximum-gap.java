class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length-1;i++) {
            ans= Math.max(Math.abs(nums[i]-nums[i+1]),ans);
        }
        return ans;
    }
}