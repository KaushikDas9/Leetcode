class Solution {

    public static boolean isPalin(int i, int j, char[] arr) {
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int find( int i, int j,char[] arr,Integer[][] dp ) { 

        if ( i==j || isPalin(i,j,arr) ) return 0;
        if( dp[i][j] != null  ) return dp[i][j];

        int ans = (int)10e9;
        for ( int k=i;k<j;k++ ) { 

            if( isPalin(i,k,arr) ) { 
                int step = 1 + find(i,k,arr,dp) + find(k+1,j,arr,dp);
                ans = Math.min(step,ans);
            }
        }

        return dp[i][j]=ans;

    }

    public int minCut(String s) {
        int n = s.length();
        Integer[][] dp = new Integer[n][n];
        return find( 0,n-1,s.toCharArray(),dp);
    }
}