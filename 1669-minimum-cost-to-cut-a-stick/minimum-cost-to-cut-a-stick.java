class Solution {




    public static int find( int i,int j,int[] arr,Integer[][] dp ) { 

        if( i>j ) return 0;
        if( dp[i][j]!=null ) return dp[i][j];

        int ans = (int)(10e9);
        for( int k=i;k<=j;k++ ) { 
            ans = Math.min( ans, ( (arr[j+1]-arr[i-1]) + find(i,k-1,arr,dp) + find(k+1,j,arr,dp) ) );
        }

        return dp[i][j]=ans;
    }
    public int minCost(int n, int[] cuts) {

        int[] arr = new int[cuts.length+2];
        arr[0]=0;int in=1;
        for( int i:cuts) arr[in++]=i;
        arr[in]=n;
        Arrays.sort(arr);
        Integer[][] dp = new Integer[arr.length][arr.length];
        return find(1,arr.length-2,arr,dp);
    }
}