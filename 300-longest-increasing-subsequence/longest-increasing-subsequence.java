class Solution {
    public static int find(int n, int pre, int[] arr, Integer[][] dp) {
        if (n == arr.length) return 0;
        if (dp[n][pre+1] != null) return dp[n][pre+1];

        int l = 0, r = 0;
        if ( pre == -1 || arr[n] > arr[pre]) l = 1 + find(n + 1, n, arr, dp);
        r = 0 + find(n + 1, pre, arr, dp);

        return dp[n][pre+1] = Math.max(l, r);
    }

    public int lengthOfLIS(int[] nums) {
        Integer[][] dp = new Integer[nums.length][ nums.length+ 1];
        return find(0,-1 , nums, dp);
    }
}