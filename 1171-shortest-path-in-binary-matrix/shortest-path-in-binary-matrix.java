class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int n = grid.length;
        int ans = Integer.MAX_VALUE;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];
        
        if( grid[0][0]!=0 ) return -1;
        q.add( new int[]{0,0,0});
        vis[0][0]=true;

        while ( !q.isEmpty() ) { 
            int[] t = q.poll();
            int row = t[0];
            int col = t[1];
            int dis = t[2];

            // left,right,up,down,downright,
            int[][] dir = { { 0,-1},{0,+1},{-1,0},{+1,0},
                    { -1,-1 },{ +1,+1 },{ +1,-1 },{ -1,+1 } };
                    
            for ( int[] i:dir ) {
                int nrow = row + i[0];
                int ncol = col + i[1];
                if ( row==n-1 && col==n-1 && ans>dis+1 ) {
                    ans=dis+1;
                }

                if( nrow>=0 && nrow<n && ncol>=0 && ncol<n &&  
                    !vis[nrow][ncol] && grid[nrow][ncol]==0 ) {

                    vis[nrow][ncol]=true;
                    q.add( new int[]{nrow,ncol,dis+1});

                }
                

            }
        }

        return ans==Integer.MAX_VALUE?-1:ans ;

    }
}