class Solution {

    public static int find( int row , int col , int[][] arr ,  int[] st ,Integer[][] dp ) { 

        int m = arr.length;
        int n = arr[0].length;

        if( row >=m || col >= n  ) return 0;
        if( dp[row][col] != null ) return dp[row][col];

        int right = find( row,col+1,arr,st,dp );
        int dia = find( row+1,col+1,arr,st,dp );
        int down = find( row+1,col,arr,st,dp );

        if( arr[row][col] == 1 ) { 

            int ans = 1 + Math.min( right , Math.min( dia,down ) );
            st[ans] = st[ans]+1;
            return dp[row][col] = ans;

        }
        return dp[row][col] = 0;


    }

    public int countSquares(int[][] matrix) {


        int m = matrix.length;
        int n = matrix[0].length;
        int store[] = new int[301];
        Arrays.fill(store,0);
        Integer dp[][] = new Integer[m][n];
        find( 0,0,matrix,store,dp );

        // System.out.println(Arrays.toString(store));

        int ans = 0;
        for( int i=300;i>=1;i--  ) { 
            if( store[i]>0 ) { 
                store[i-1] = store[i-1]+store[i];
            }
            ans += store[i];
        }
         return ans;

    }
}