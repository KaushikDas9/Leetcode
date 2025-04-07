class Solution {

    public static boolean find(int index, int target, int[] arr, Boolean[][] dp) {
        if (target == 0) return true;
        if (index < 0 || target < 0) return false;

        if (dp[index][target] != null) return dp[index][target];

       
        boolean pick = find(index - 1, target - arr[index], arr, dp);
        boolean notPick = find(index - 1, target, arr, dp);

        dp[index][target] = pick || notPick;
        return dp[index][target];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;
        Boolean[][] dp = new Boolean[n][target + 1];

        return find(n - 1, target, nums, dp);
    }
}
