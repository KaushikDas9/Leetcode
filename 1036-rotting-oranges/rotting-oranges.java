class Solution {
    
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int ans =0;
        Queue<ArrayList<Integer>> q = new LinkedList<>();
       

        for( int i=0;i<n;i++ ) {
            for( int j=0;j<m;j++ ) {
                if( grid[i][j]==2  ) {
                    ArrayList<Integer> l = new ArrayList<>(); 
                    l.add(i); l.add(j); l.add(0);
                    q.add(l);
                }
            }
        }

        while( !q.isEmpty() ) {

            ArrayList<Integer> temp = q.poll();
            int row = temp.get(0);
            int col = temp.get(1);
            int time = temp.get(2);
            ans = time;
            // left
            if( (col-1)>=0 && grid[row][col-1]==1 ) {
                // q add , vis add ,time increase
            
                grid[row][col-1]=2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(row); l.add(col-1); l.add(time+1);
                q.add(l);
            }
            // right 
            if( (col+1)<=m-1 && grid[row][col+1]==1   ) {
                // q add , vis add ,time increase
              
                grid[row][col+1]=2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(row); l.add(col+1); l.add(time+1);
                q.add(l);
            }
            // up 
            if( (row-1)>=0 && grid[row-1][col]==1  ) {
                // q add , vis add ,time increase
                
                grid[row-1][col]=2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(row-1); l.add(col); l.add(time+1);
                q.add(l);
            }
            // down 
            if( (row+1)<=n-1 && grid[row+1][col]==1 ) {
                // q add , vis add ,time increase
                
                grid[row+1][col]=2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(row+1); l.add(col); l.add(time+1);
                q.add(l);
            }

        }


        for( int i=0;i<n;i++ ) {
            for( int j=0;j<m;j++ ) {
                if( grid[i][j] == 1    ) {
                    return -1;
                }
            }
        }
        return ans;
    }
}