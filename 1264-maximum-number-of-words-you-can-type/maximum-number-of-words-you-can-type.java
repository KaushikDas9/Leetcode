class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        HashSet<Character> set = new HashSet<>();

        // Adding brokenLetters into HashSet for O(1) check 
        //  That letter of text from brokenLetters or not
        for ( int i = 0 ; i <brokenLetters.length() ; i++ ) {
            set.add(brokenLetters.charAt(i));
        }


        int ans = 0 ; 

        for ( int i = 0 ; i < text.length(); i++ ) {

            char ch = text.charAt(i);

            // if space is then we got our valid word .
            // so increase it one time
            if( ch == ' ' ) ans++;

            if( set.contains(ch) ) {
                
                while( i < text.length() && text.charAt(i) != ' ') {
                    i++;
                } 

                if( i == text.length() ) return ans;

            }
            
        }

        return ans + 1 ;

    }
}

//  text = "heddo world" , brokenLetters = "ad"

