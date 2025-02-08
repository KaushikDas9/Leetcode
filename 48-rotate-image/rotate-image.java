class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length; 
        int m = matrix[0].length;

        int[][] temp = new int[n][m];

        int a=0;
        for ( int i=0;i<n;i++ ) { 
            int b=0;
            for ( int j=n-1;j>=0;j-- ) {
                
                temp[a][b++] = matrix[j][i];
            }
            a++;
        }


        for ( int i=0;i<n;i++) {
            for ( int j=0;j<n;j++ ) {
                
                matrix[i][j]= temp[i][j];
            }
        }
    }
}