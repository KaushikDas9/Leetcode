class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int ans = 0 ,  j=0;
        
        for( int i=0; i<s.length(); i++ ) {
         
               if(!set.contains(s.charAt(i)) ) {
                    
                    ans=Math.max(ans,i+1-j);
                    set.add(s.charAt(i)); 
               }
               else {
                   
                    while(set.contains(s.charAt(i))) {
                        set.remove(s.charAt(j));
                        j++;
                    }
                        set.add(s.charAt(i)); 
               }
            
        }

        return ans;
        
    }
}