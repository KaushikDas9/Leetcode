class Solution {
    public int[] numberGame(int[] nums) {
        

        Arrays.sort(nums);
        int ans[] = new int[nums.length];
        int ind =0;
        for( int  i=0;i<nums.length;i+=2 ) { 

            int a =  nums[i];
            int b =  nums[i+1];

            ans[ind++] = b ;ans[ind++] = a ;
        }

        return ans ;
    }
}