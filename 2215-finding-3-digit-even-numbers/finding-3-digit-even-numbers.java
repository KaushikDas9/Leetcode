class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> store = new TreeSet<>();
        int n = digits.length;

        for ( int i = 0 ; i < n ; i++ ) { 
            if( digits[i] == 0 ) continue;
            for ( int j = 0 ; j < n ; j++ ) { 
                if( j == i ) continue;
                for( int  k = 0 ; k < n ; k++  ) { 
                    if( k == i || k == j ) continue;
                    int t = ( digits[i] * 100 ) + ( digits[j] * 10 ) + ( digits[k] );
                    if( t % 2 == 0 ) store.add(t);

                }
            }
        }

        int[] ans = new int[store.size()];
    
        int in = 0 ;
        for( int i : store ) ans[in++] = i ;

        return ans;

    }
}

// [ 2 , 2 , 2 , 8 , 8 ]
// 