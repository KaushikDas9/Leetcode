class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int[] arr = new int[101];
        // 1950 - 0 ..... 2050 - 100
        int ans =  0 ;


        for ( int i = 0 ; i < logs.length ; i++ ) { 

            int start = logs[i][0];
            int end = logs[i][1];

            for ( int j = start ; j < end ; j++  ) { 
                arr [ j - 1950 ] = arr [ j - 1950 ] + 1 ;
            }

        }

        int maxi = Integer.MIN_VALUE;

        for ( int i = 0 ; i < arr.length ; i++  ) System.out.print(arr[i]);

        for ( int i = 0 ; i < arr.length ; i++  ) {

            if ( arr[i] > maxi ) { 
                ans = i + 1950 ;
                maxi = arr[i];
            }

        }

        return ans ; 
    }
}

// 1993 - 1999 

// 93 94 95 96 97 98 99 00 01 02 .. .....  10
// 1.  1. 1. 1. 1. 1. 1.1  1. 1.  1 1. 1 1 

