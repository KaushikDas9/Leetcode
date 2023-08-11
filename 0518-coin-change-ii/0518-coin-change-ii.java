class Solution {

    public static int find( int n , int[] arr , int tar,int dp[][])
    {
        if(tar == 0 ) return 1;
        if(n < 0 ) return 0;
       if( dp[n][tar] != -1 ) return dp[n][tar];

           int take =0 ; 
           if( arr[n]<=tar ) take=  find(n , arr , tar - arr[n],dp );
           int ntake=  find( n-1,arr,tar,dp ); 
          

        return dp[n][tar]=ntake + take;

    }


    public int change(int amount, int[] coins) {

        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for( int i=0 ; i<n ;i++ ) { Arrays.fill(dp[i] , -1 );}
        return find ( n-1,coins , amount ,dp);

    }
}
