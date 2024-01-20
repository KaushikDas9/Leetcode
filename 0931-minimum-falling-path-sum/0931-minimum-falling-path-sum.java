class Solution {

    public static int solve( int row , int col , int arr[][] , int[][] dp  ) { 

            if( row >= arr.length || col >= arr[0].length ) return Integer.MAX_VALUE;
            if( row == arr.length-1  ) return arr[row][col];
            if( dp[row][col] != Integer.MAX_VALUE  ) return dp[row][col];
            int a=Integer.MAX_VALUE; int b=Integer.MAX_VALUE; int c=Integer.MAX_VALUE;
            //down  ( r+1 ,c )
               a =  solve( row+1 , col , arr ,dp );
               
            //downLeft ( r+1 ,c-1 )
            if( col  > 0 )
               b = solve( row+1 , col-1 , arr ,dp );
            //downRigth ( r+1 , c+1 )
            if( col  < arr[0].length-1 )
               c = solve( row+1 , col+1 , arr ,dp );

               return dp[row][col] = Math.min ( a , Math.min(b,c) ) + arr[row][col];

    } 


    public int minFallingPathSum(int[][] matrix) {

        int n = matrix[0].length;
        int m=matrix.length;
        int ans = Integer.MAX_VALUE;

        int[][] dp = new int[m][n];

        for( int i=0;i<m;i++ ) Arrays.fill(dp[i] ,Integer.MAX_VALUE );


        for( int i=0;i<n ; i++ ) { 
           ans = Math.min (ans , solve( 0,i,matrix ,dp ) ) ;
         }
         
         return ans;
    
    }
}