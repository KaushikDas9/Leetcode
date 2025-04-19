class Solution {

    public static int find( int i , int m , int n , List<List<Integer>> s  , Integer[][][] dp ) { 
        
        if( ( m == 0 && n == 0 ) || i==s.size() ) return 0;
        if( dp[i][m][n] != null ) return dp[i][m][n];

        int take = 0 , ntake = 0 ;

        if( s.get(i).get(0) <= m &&  s.get(i).get(1) <= n ) 
            take = 1 + find( i+1 , m - s.get(i).get(0) , n - s.get(i).get(1) , s , dp );

        ntake = find( i+1 , m , n , s , dp ) ;

        return dp[i][m][n] = Math.max( take , ntake );
    }

    public int findMaxForm( String[] strs , int m , int n ) {
        
        List<List<Integer>> store = new ArrayList<>();

        Integer[][][] dp = new Integer[strs.length+1][m+1][n+1];

        for ( int i = 0 ; i < strs.length ; i++ ) { 

            int o = 0 , z = 0;
            List<Integer> t = new ArrayList<>();
            String s = strs[i];

            for ( int j = 0 ; j < s.length() ; j++  ) { 
                if( s.charAt(j) == '1' ) o++;
                else z++;
            }
            t.add(z) ; t.add(o) ;
            store.add( t );

        }

        return find( 0 , m , n , store , dp );
        
        
    }
}