class Solution {
    public String makeSmallestPalindrome(String s) {
        
        int n=s.length();
        int i=0,j=n-1;
        String ans="";
        char[] str = s.toCharArray();

        while( i<j ) { 

            if( str[i] != str[j] ) {
                if( str[i]>str[j] ) str[i] = str[j];
                else str[j] = str[i];
            }
            i++;j--;
        }

        return new String(str);
    }
}