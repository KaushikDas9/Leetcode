class Solution {
       static int mod = 1000000009;
     public static int find(int i ,int j , int[][] arr,int[][] dp)
     {
        if(i>=0 && j>=0 && arr[i][j] == 1)  return 0;
        if(i<0 || j<0) return 0;
        if(i==0 & j==0)  return 1;
 
        if(dp[i][j] != -1)  return dp[i][j];



         int up = find(i-1,j,arr,dp) ;
         int left = find(i,j-1,arr,dp);

         return dp[i][j]=(up+left);

     }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

            int n = obstacleGrid.length;
            int m=obstacleGrid[0].length;
            int[][] dp= new int[n+1][m+1];
            for(int i=0 ; i<n+1 ; i++ ) {Arrays.fill( dp[i] , -1);}
  
            return find(n-1,m-1,obstacleGrid,dp);

    }
}