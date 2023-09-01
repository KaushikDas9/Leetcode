class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> map= new HashMap<>();
        int ans = Integer.MIN_VALUE,maxValue = Integer.MIN_VALUE,j=0;
        for( int i=0 ;i<s.length();i++ ) { 

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1 );
            maxValue = Math.max(maxValue, map.get(s.charAt(i)) );
            while(i-j-maxValue >= k ) {
                  map.put(s.charAt(j), map.get(s.charAt(j))-1 );
                    j++;
            }
             ans = Math.max( ans, i-j+1 );
        }

            return ans;

    }
}