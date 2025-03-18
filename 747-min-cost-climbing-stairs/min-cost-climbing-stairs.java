class Solution {


    public static int find( int[] arr,int i,Integer[] dp ) { 

        if( i>=arr.length ) return 0;
        if( dp[i]!= null ) return dp[i];

        int a = arr[i]+find(arr,i+1,dp);
        int b = arr[i]+find(arr,i+2,dp);

        return dp[i]=Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        
        Integer[] dp = new Integer[cost.length];
        return Math.min(find(cost,0,dp),find(cost,1,dp));
        
    }
}