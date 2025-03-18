class Solution {


    public static int find( int[] arr,int n,Integer[] dp ) { 

        if( n<0 ) return 0;
        if( dp[n]!= null ) return dp[n];

        int a = arr[n]+find(arr,n-1,dp);
        int b = arr[n]+find(arr,n-2,dp);

        return dp[n]=Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        Integer[] dp = new Integer[n];
        // return Math.min(find(cost,n-1,dp),find(cost,n-2,dp));

        dp[0]=cost[0];
        dp[1]=cost[1];

        for( int i=2;i<n;i++) { 

            int a = cost[i]+dp[i-1];
            int b = cost[i]+dp[i-2];

            dp[i]=Math.min(a,b);
        }

        
        return Math.min(dp[n-1],dp[n-2]);
    }
}