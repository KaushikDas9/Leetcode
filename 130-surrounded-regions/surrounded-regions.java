class Solution {

    public static void dfs(char[][] board ,int[][] vis,int row,int col,
            int[] delrow , int[] delcol ) { 
            
            int n= board.length;
            int m= board[0].length;
            vis[row][col]=1;

            for ( int i=0;i<4;i++ ) {
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];

                if( nrow>=0 && ncol>=0 && nrow<n && ncol<m 
                        && vis[nrow][ncol] == 0 && board[nrow][ncol]=='O'   ) {
                        
                        dfs( board,vis,nrow,ncol,delrow,delcol );
                }
            }
        
    }
    public void solve(char[][] board) {
        
        int n= board.length;
        int m= board[0].length;
        int[][] vis = new int[n][m];
        // up , down , left , right
        int[] delrow = { -1,+1,0,0 };
        int[] delcol = {  0,0,-1,+1 };

        for ( int i=0;i<m;i++) {
            // upper row
            if( vis[0][i] == 0 && board[0][i]=='O' ) {
                dfs(board,vis,0,i,delrow,delcol);
            }
            // lower row
            if( vis[n-1][i] == 0 && board[n-1][i]=='O' ) {
                dfs(board,vis,n-1,i,delrow,delcol);
            }
        }

        for ( int i=0;i<n;i++) {
            // left col
            if( vis[i][0] == 0 && board[i][0]=='O' ) {
                dfs(board,vis,i,0,delrow,delcol);
            }
            // right col
            if( vis[i][m-1] == 0 && board[i][m-1]=='O' ) {
                dfs(board,vis,i,m-1,delrow,delcol);
            }
        }

        for ( int i=0;i<n;i++ ) {
            for( int j=0;j<m;j++ ) {
                if( vis[i][j]==0 && board[i][j]=='O' ) {
                    board[i][j]='X';
                }
            }
        }

        // return board;
    }
}