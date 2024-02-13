class Solution {


    boolean cheakPrefix( String word , int ind ) { 

        for( int i= ind ; i<word.length() ; i++ ) { 

            if( word.charAt(i-ind) != word.charAt(i) ) return false ;
        }

        return true;
    }
    public int minimumTimeToInitialState(String word, int k) {
        
        int count=1;

        for( int i =k ; i< word.length() ; i = i+k) { 

            if( cheakPrefix( word,i ) )  return count ;
            count++;
        }

        return count;
    }
}