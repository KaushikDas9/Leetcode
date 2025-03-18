class Solution {
    public List<Integer> partitionLabels(String s) {

        int n= s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for( int i=0;i<n;i++ ) map.put( s.charAt(i),map.getOrDefault(s.charAt(i),0)+1 );

        for( int i=0;i<n;i++ ) { 

            int j=i;    
            set.add( s.charAt(i) );

            while( j<n && !set.isEmpty() ) { 

                set.add( s.charAt(j) );
                if(  map.get(s.charAt(j))>1  ) { 
                    map.put(s.charAt(j),map.get(s.charAt(j))-1);
                } else {
                    set.remove(s.charAt(j));    
                    map.remove(s.charAt(j));
                }
                j++;
            }

            ans.add(j-i);
            i=j-1;

        }

        return ans;

    }
}