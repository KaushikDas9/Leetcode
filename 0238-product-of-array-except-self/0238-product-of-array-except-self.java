class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp=1;int count=0;
        for(int i=0 ;i<nums.length ;i++)
        {
           if(nums[i]!=0) {temp *= nums[i] ;}
           else{count++;}
        }

        if(count>1) {
                int zero[] = new int[nums.length];
                // zero[0] = 1;
                return zero;
            }
        int ans[] = new int[nums.length];
        for(int i=0 ;i<nums.length ;i++)
        {
           if(nums[i]==0)
            {
                int zero[] = new int[nums.length];
                zero[i] = temp;
                return zero;
            }
            ans[i]=temp/nums[i];
        }
        return ans;
    }
}