class Solution {

    public static int find( int row , int col , int maxMove , int m , int n , Integer[][][] dp  ) { 
        int mod = (int) 1e9+7 ;
        if( row >= m || col>= n || col < 0 || row < 0 ) return 1; 
        if( dp[row][col][maxMove] != null ) return dp[row][col][maxMove];
        // if( maxMove == 0 ) return 0;
        double left=0;double right =0;double up =0;double down =0 ;

        if( maxMove != 0 ) {
            left += find( row,col-1,maxMove-1,m,n,dp)%mod; 
            right += find( row,col+1,maxMove-1,m,n,dp)%mod;
            up += find( row-1,col,maxMove-1,m,n,dp)%mod;
            down += find( row+1,col,maxMove-1,m,n,dp)%mod;
        }

        return dp[row][col][maxMove] = (int) ((left+right+up+down) %mod );
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        Integer[][][] dp = new Integer[m][n][maxMove+1];
        return find( startRow,startColumn,maxMove,m,n,dp );
    }
}