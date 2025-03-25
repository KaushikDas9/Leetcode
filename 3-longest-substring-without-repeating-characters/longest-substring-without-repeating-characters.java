class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        int ans =0,j=0;
        for ( int i=0;i<s.length();i++ ) { 

            map.put(s.charAt(i),map.getOrDefault( s.charAt(i),0 )+1);

            while( map.get(s.charAt(i))>1 ) { 
                
                map.put( s.charAt(j),map.get(s.charAt(j++))-1);
            }

            ans = Math.max(ans,i-j+1);
        }

        return ans;
    }

}