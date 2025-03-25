class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap< Character , Integer > map = new HashMap<>(); 

        for ( int i=0;i<s.length();i++ ) { 
             map.put( s.charAt(i) , map.getOrDefault( s.charAt(i),0 )+1 );
        }
        int j=0,prev=0;
        for ( Map.Entry<Character , Integer> entry: map.entrySet()) { 
            if(j==0) { prev = entry.getValue(); j++;}
            else { 
                if( prev != entry.getValue() ) return false;
                prev = entry.getValue();
            } 
        }
        return true;
    }
}