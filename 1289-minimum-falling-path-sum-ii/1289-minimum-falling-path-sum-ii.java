class Solution {

    public static int solve( int row,int col, int[][] grid , int dp[][] ) { 
        
        if ( row >= grid.length || col >= grid[0].length ) return Integer.MAX_VALUE;
        if( grid.length-1 == row ) return  grid[row][col];
        if( dp[row][col] != Integer.MAX_VALUE ) return dp[row][col];


        int right = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        //right
        for( int i=0;i<grid[0].length ;i++ ) {
            if( i != col ) right = solve( row+1,i,grid,dp ) + grid[row][col] ;  
            ans = Math.min ( right ,ans ) ;  
        }


        return dp[row][col] = ans  ;

    }
    public int minFallingPathSum(int[][] grid) {
            
        int n = grid.length;
        int m = grid[0].length;
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[n][m];

        for( int i=0;i<n;i++  ) Arrays.fill( dp[i] , Integer.MAX_VALUE );

        for( int i=0;i<m;i++ ) { 
            ans = Math.min( ans , solve( 0,i,grid,dp  ) ); 
        }
         
         return ans;
    }
}