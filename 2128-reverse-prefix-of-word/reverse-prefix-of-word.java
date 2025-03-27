class Solution {
    public String reversePrefix(String word, char ch) {
        
        int n=word.length();
        StringBuilder str = new StringBuilder(word);
        String ans = "";
        for ( int i=0;i<word.length();i++ ) { 

            if( str.charAt(i) == ch ) {

                String t = str.substring(0,i+1);
                StringBuilder str1 = new StringBuilder(t);
                str1.reverse();
                String a = str.substring(i+1, n);
                ans = str1.toString()+a;
                break;
            } 
        }
        return ans==""?word:ans;

    }
}