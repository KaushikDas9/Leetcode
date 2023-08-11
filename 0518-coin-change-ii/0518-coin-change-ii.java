//Memorization
class Solution {

    public static int find( int n , int[] arr , int tar,int dp[][])
    {
        if(tar == 0 ) return 1;
        if( n==0 ) {
            if( tar%arr[0] == 0 ) return 1;
            else return 0;
        }

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






//Tabulation 

 public int change(int amount, int[] coins) {

        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for( int i=0 ; i<n ;i++ ) { dp[i][0]=1; }
        for(int j=0;j<amount+1;j++) { if(j % coins[0] == 0) dp[0][j] =1; else dp[0][j]=0; }
 

        for( int i=1 ; i<n ;i++ ) {
            for( int tar=1 ; tar<amount+1 ;tar++ ) { 
                int take =0 ; 
                 if( coins[i]<=tar ) take=  dp[i][tar - coins[i]];
                int ntake=  dp[i-1][tar];

                dp[i][tar] = take + ntake ; 
            }
        }
        return dp[n-1][amount] ;

    }
}
