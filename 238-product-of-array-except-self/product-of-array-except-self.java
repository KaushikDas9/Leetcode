class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] pre = new int[n+1];
        int[] post = new int[n+1];
        int[] ans = new int[n];
        pre[0]=1;
        post[n]=1;

        for( int i=0;i<n;i++ ) { 
            pre[i+1]=pre[i]*nums[i];
            post[n-1-i]=post[n-i]*nums[n-1-i];
        }
 
        for( int i=0;i<n;i++ ) { 
            ans[i]=pre[i]*post[i+1];
        }

        return ans;
    }
}