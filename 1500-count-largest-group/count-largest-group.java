class Solution {

    public int digitCount( int n ) { 
        
        int count = 0; 

        while( n > 0 ) { 
            count += n % 10 ;
            n /= 10;
        }
        return count ;
    }

    public int countLargestGroup(int n) {
        

        HashMap< Integer , Integer > map = new HashMap<>();
        int max_value= 0 ;

        for ( int i = 1; i <= n; i++ ) { 

            int t = digitCount(i);

            map.put( t , map.getOrDefault( t , 0 ) + 1 );
            max_value = Math.max( max_value , map.get( t ) );

        }

        // System.out.println(map);

        int ans = 0 ; 

        for ( Map.Entry< Integer , Integer > entry : map.entrySet() ) { 

            if( entry.getValue() == max_value ) ans++ ;
        }

        return ans;

    }
}