class Solution {
    public int countSubstrings(String s, String t) {
        

        int ans =0 ;
        for( int i=0;i<s.length();i++  ) {
            for( int j=0;j<t.length();j++ ) { 
                
                int a=i;int b=j;int count=0;

                while( a<s.length() && b<t.length() ) {     

                    if( s.charAt(a) != t.charAt(b) ) count++;
                    if( count==1) ans++;
                    if( count == 2 ) break;
                    a++;b++;
                }

            } 
        }
        return ans;
        
    }
}