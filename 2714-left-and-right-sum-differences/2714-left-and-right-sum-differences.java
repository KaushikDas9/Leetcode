class Solution {
    public int[] leftRightDifference(int[] nums) {
          int n = nums.length;
        int[] ls = new int[n];
        ls[0]=0;
        int[] rs = new int[n];
        rs[n-1]=0;

        int l=1,r=n-2,sum=0;
        for(int i= 0 ;i<n-1;i++)
        {            
            sum += nums[i];
            ls[l++] = sum;
        }
        sum=0;
        for(int i= n-1 ;i>0;i--)
        {
            sum += nums[i];
            rs[r--] = sum; 
        }
       int[] ans= new int[n];

        for(int i=0;i<n;i++)
        {
            ans[i]=Math.abs(ls[i]-rs[i]);
        }
        return ans;
    }
}