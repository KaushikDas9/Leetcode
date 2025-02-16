class Solution {
    public int minimumEffortPath(int[][] heights) {
        

        int n = heights.length;
        int m = heights[0].length;
        int ans = Integer.MAX_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[][] dist = new int[n][m];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        pq.add( new int[]{0,0,0});
        dist[0][0]=0;

        while ( !pq.isEmpty() ) { 
            int[] t = pq.poll();
            int effort = t[0];
            int row = t[1];
            int col = t[2];

            // left,right,up,down
            int[][] dir = {{0,-1},{0,+1},{-1,0},{+1,0}};
            if ( row==n-1 && col==m-1 ) {
                    return effort;
                }
                    
            for ( int[] i:dir ) {

                int nrow = row + i[0];
                int ncol = col + i[1];

                if( nrow>=0 && nrow<n && ncol>=0 && ncol<m  ) {

                     int newEffort = Math.max(effort, Math.abs(heights[row][col] - heights[nrow][ncol]));

                    if (newEffort < dist[nrow][ncol]) {
                        dist[nrow][ncol] = newEffort;
                        pq.add(new int[]{newEffort, nrow, ncol});
                    }
                }
                

            }
        }

        return 0;
    }
}