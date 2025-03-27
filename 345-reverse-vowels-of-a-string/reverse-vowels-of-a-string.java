class Solution {

    public static boolean isVowel(char x) { 
            if (x == 'a' || x == 'e' || 
                x == 'i' || x == 'o' || x == 'u' ||x == 'A' || x == 'E' || 
                x == 'I' || x == 'O' || x == 'U' ) 
                return true;
        return false;
    } 

    public String reverseVowels(String s) {
        
        int n = s.length();
        int i=0 , j=n-1;
        StringBuilder str = new StringBuilder(s);
        while ( i<j ) {

            while( i<j && !isVowel(str.charAt(i)) ) {
                i++;
            }
            while(i<j && !isVowel(str.charAt(j)) ) { 
                j--;
            }

            if( i<j ){
                char t=str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, t);
                i++;j--;
            }
        }

        return str.toString();

    }
}