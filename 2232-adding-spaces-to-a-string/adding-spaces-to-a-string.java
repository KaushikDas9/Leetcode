class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder ans = new StringBuilder();
        int prev = 0;
        for (int i = 0; i < spaces.length; i++) {
            
            ans.append(s.substring(prev, spaces[i]));
            ans.append(" ");
            prev = spaces[i];
        }

        ans.append(s.substring(prev));
        return ans.toString();
    }
}