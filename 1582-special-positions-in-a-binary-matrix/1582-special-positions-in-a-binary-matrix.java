class Solution {

    public static boolean find( int[][] mat, int row ,int col ) {

            for( int j=0;j<mat[0].length;j++ ) {  // 0,3
                if( j!=col && mat[row][j]!=0  ) return false;
            }

             for( int j=0;j<mat.length;j++ ) {
                if( j!=row && mat[j][col]==1 ) return false;
            }

        return true;
    }

    public int numSpecial(int[][] mat) {
        int count=0;

        for( int i=0;i<mat.length;i++ ) {
            for( int j=0;j<mat[0].length;j++ ) {
                if( mat[i][j]==1 ) { if ( find(mat,i,j) ) count++; }
            }
        }  
        return count;  
    }
}