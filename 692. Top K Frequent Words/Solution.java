class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for( int  i=0;i<words.length;i++ ) {
             map.put( words[i] , map.getOrDefault( words[i] ,0 )+1 );
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( (a,b) -> b-a );

        for( Map.Entry<String,Integer> entry : map.entrySet() ) {
          pq.add( entry.getValue());
        }


        while(k>0 && !pq.isEmpty()) { 

            int temp = pq.poll();
            List<String> list = new ArrayList<>();
            for( Map.Entry<String,Integer> entry : map.entrySet() ) { 
                
                if( k<=0) break;
                if( entry.getValue() == temp ) { 
                    list.add(entry.getKey());
                    map.put(entry.getKey(),-1);
                    // k--;
                }
            }

            Collections.sort(list);
           if( list.size() <= k ) { ans.addAll(list); k-=list.size(); }
           else { 
               for(var i : list) { 
                   if( k ==0) break ;
                   ans.add(i);k--;
               }
           }
            list.clear();
        }    
            
                 
                
            
        
        // Collections.sort(ans);
        return ans;
    }
}