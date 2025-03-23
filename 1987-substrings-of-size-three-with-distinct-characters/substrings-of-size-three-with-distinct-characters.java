class Solution {
    public int countGoodSubstrings(String s) {
        
        int n=s.length();
        if(n<=2) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put( s.charAt(0),map.getOrDefault( s.charAt(0),0 )+1 );
        map.put( s.charAt(1),map.getOrDefault( s.charAt(1),0 )+1 );
        int j=0,ans=0;

        for( int i=2;i<n;i++ ) { 

            char c = s.charAt(i);
            map.put( c,map.getOrDefault( c,0 )+1 );
            if( map.size()==3 ) ans++;
            if( map.get(s.charAt(j))==1 ) map.remove( s.charAt(j++) );
            else map.put( s.charAt(j),map.get(s.charAt(j++))-1 );
        }   

        return ans;

    }
}