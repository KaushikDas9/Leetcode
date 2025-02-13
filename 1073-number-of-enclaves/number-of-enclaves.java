class Solution {

    public static void dfs(int[][] board ,int[][] vis,int row,int col,
            int[] delrow , int[] delcol ) { 
            
            int n= board.length;
            int m= board[0].length;
            vis[row][col]=0;

            for ( int i=0;i<4;i++ ) {
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];

                if( nrow>=0 && ncol>=0 && nrow<n && ncol<m 
                        && vis[nrow][ncol] == -1 && board[nrow][ncol]==1   ) {
                        
                        dfs( board,vis,nrow,ncol,delrow,delcol );
                }
            }
        
    }
    public int numEnclaves(int[][] grid) {
        

        int n= grid.length;
        int m= grid[0].length;
        int[][] vis = new int[n][m];
        
        for ( int i=0;i<n;i++ ) {
            for( int j=0;j<m;j++ ) {
                vis[i][j]=-1;
            }
        }
        
        // up , down , left , right
        int[] delrow = { -1,+1,0,0 };
        int[] delcol = {  0,0,-1,+1 };

        for ( int i=0;i<m;i++) {
            // upper row
            if( vis[0][i] == -1 && grid[0][i]==1 ) {
                dfs(grid,vis,0,i,delrow,delcol);
            }
            // lower row
            if( vis[n-1][i] == -1 && grid[n-1][i]==1 ) {
                dfs(grid,vis,n-1,i,delrow,delcol);
            }
        }

        for ( int i=0;i<n;i++) {
            // left col
            if( vis[i][0] == -1 && grid[i][0]==1 ) {
                dfs(grid,vis,i,0,delrow,delcol);
            }
            // right col
            if( vis[i][m-1] == -1 && grid[i][m-1]==1 ) {
                dfs(grid,vis,i,m-1,delrow,delcol);
            }
        }

        int ans = 0;
        for ( int i=0;i<n;i++ ) {
            for( int j=0;j<m;j++ ) {
                if( vis[i][j]==-1 && grid[i][j]==1 ) {
                    ans++;
                }
            }
        }
        return ans;
    }
}