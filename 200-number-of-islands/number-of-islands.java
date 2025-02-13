class Solution {

    public static void dfs(char[][] grid,int[][] vis,int row,int col ) {

        int n = grid.length;
        int m = grid[0].length;
        vis[row][col]=1;
        int[][] dir = { {0,-1},{0,+1},{-1,0},{+1,0}};

        for( int[] i:dir ) {
            int nrow=row+i[0];
            int ncol=col+i[1];
            if( nrow>=0 && ncol>=0 && nrow<n && ncol<m &&
                vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1' ) { 
                dfs(grid,vis,nrow,ncol);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];

        int ans = 0;
        for ( int i=0;i<n;i++ ) {
            for ( int j=0;j<m;j++ ) {
                if( vis[i][j] == 0 && grid[i][j] == '1' ) {
                    ans++;
                    dfs(grid,vis,i,j);
                } 
            }
        } 

        return ans;
    }

}