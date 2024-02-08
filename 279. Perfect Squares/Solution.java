class Solution {

    public int find(int n, Integer[] dp) {

        if (n <= 0) return 0;
        if (dp[n] != null) return dp[n];

        int ans = (int) 1e9;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, find(n - i * i, dp) + 1);
        }

        return dp[n] = ans;
    }

    public int numSquares(int n) {

        Integer[] dp = new Integer[n + 1];
        return find(n, dp);
    }
}