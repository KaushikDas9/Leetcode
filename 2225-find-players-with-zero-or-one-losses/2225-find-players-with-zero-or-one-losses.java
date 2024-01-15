class Solution {
    public List<List<Integer>> findWinners( int[][] matches ) {

        HashMap< Integer , Integer > map = new HashMap<>();
        
        int n = matches.length;
        List<List<Integer>> ans = new ArrayList<>();

        for ( int i=0 ; i<n ; i++ ) { 
           
                map.put( matches[i][0] , map.getOrDefault( matches[i][0] , 0 )+0 );
                map.put( matches[i][1] , map.getOrDefault( matches[i][1] , 0 )+1 );
        }

        List<Integer> temp1 =  new ArrayList<>();

        for( Map.Entry< Integer , Integer > entry : map.entrySet() ) { 

                if( entry.getValue() == 0 ) temp1.add( entry.getKey() );
                // if( entry.getValue() == 1 ) ans.get( 1 ).add( entry.getKey() );
        }
            List<Integer> temp2 =  new ArrayList<>();
        for( Map.Entry< Integer , Integer > entry : map.entrySet() ) { 

                // if( entry.getValue() == 0 ) temp2.add( entry.getKey() );
                if( entry.getValue() == 1 ) temp2.add( entry.getKey() );
        }
        Collections.sort(temp1);Collections.sort(temp2);
        ans.add(temp1);
        ans.add(temp2);

        return ans;


    }
}