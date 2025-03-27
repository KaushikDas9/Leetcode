class Solution {
    public String reverseWords(String s) {
        
        String ans = "";
        int j=0;
        for ( int i=0;i<s.length();i++ ) { 

            if( s.charAt(i)== ' ' ) {
                StringBuilder str = new StringBuilder(s.substring(j,i));
                ans +=str.reverse();
                ans += ' ';
                j=i+1;
            }
        }

        StringBuilder str = new StringBuilder(s.substring(j,s.length()));
        ans +=str.reverse();

        return ans;
    }
}