class Solution {

    // t - O(N)
    // s - O(N)
    public List<Integer> findAnagrams(String s, String p) {

        if(s.length()<p.length() ) return new ArrayList<>(); 
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        List<Integer> ans = new ArrayList<>();
        for ( int i=0;i<p.length();i++ ) { 
            map1.put( s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1 );
            map2.put( p.charAt(i),map2.getOrDefault(p.charAt(i),0)+1 );
        }

        for ( int i=0;i<s.length()-p.length();i++ ) { 

            if( map1.equals(map2) ) ans.add(i);

            map1.put(s.charAt(i),map1.get(s.charAt(i))-1);
            if ( map1.get(s.charAt(i))==0 ) map1.remove( s.charAt(i) );

            map1.put( s.charAt(i+p.length()),map1.getOrDefault(s.charAt(i+p.length()),0)+1 );
        }

        if( map1.equals(map2) ) ans.add(s.length()-p.length());
        return ans;

    }
}