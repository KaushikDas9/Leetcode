class Solution {

    public double find( int row , int col , int n , int move,Double dp[][][] ) { 

        if( row >= n || col >= n || col<0 || row < 0  ) return 0;
        if( move == 0 ) return 1;
        if( dp[row][col][move] != null ) return dp[row][col][move];

        double move1 = find ( row-1 , col-2 , n , move-1,dp ) ;
        double move2 = find ( row-2 , col-1 , n , move-1,dp ) ;
        double move3 = find ( row-2 , col+1 , n , move-1,dp ) ;
        double move4 = find ( row-1 , col+2 , n , move-1,dp ) ;
        double move5 = find ( row+1 , col-2 , n , move-1,dp ) ;
        double move6 = find ( row+2 , col-1 , n , move-1,dp ) ;
        double move7 = find ( row+1 , col+2 , n , move-1,dp ) ;
        double move8 = find ( row+2 , col+1 , n , move-1,dp ) ;
        
        return dp[row][col][move] = (move1+move2+move3+move4+move5+move6+move7+move8)/8 ;
 
    }

    public double knightProbability(int n, int k, int row, int column) {

        Double dp[][][] = new Double[n][n][k+1];
        if( (n==1) && (k==0)) return (double)1;
        double count = find( row,column,n,k,dp );
        if( count ==0 ) return 0;
        
        return count ;

    }
}