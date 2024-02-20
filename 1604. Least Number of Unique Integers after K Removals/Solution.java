class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap< Integer ,Integer> map = new HashMap<>();

        for( int i:arr)  map.put( i , map.getOrDefault( i,0 )+1);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for( Map.Entry<Integer,Integer> i : map.entrySet() ) pq.add( i.getValue());
          
        while( k>0) { 

            int temp= pq.peek();
            k -= temp;
            if( k >= 0 ) pq.poll();
            
        }
        return pq.size();

           
    }
}