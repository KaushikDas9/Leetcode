class Solution {
    public String reverseWords(String s) {

        List<String> list = new ArrayList<>();

        int j=0;
        for( int i=0;i<s.length();i++ ) { 
            j=i;
            while( i<s.length() && s.charAt(i) != ' ' ) { 
                i++;
            }

            if( i>j) { 
                list.add(s.substring(j,i));
            } 
        }
        String ans ="";
        for ( int i=list.size()-1;i>=0;i-- ) { 
            ans += list.get(i);
            if( i>0 ) ans += " ";
        }
        return ans;

    }
}