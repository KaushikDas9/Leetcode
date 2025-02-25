class Solution {
      public static void find( int n,String s, List<String> ans ) {

        if( n==0 ) { 
            ans.add( s );
            return ;
        }

        find(n-1,s+"1",ans);
        if( s.length()>0 && s.charAt(s.length()-1) != '0' ) find(n-1,s+"0",ans);
        if( s.length()==0  ) find(n-1,s+"0",ans);
        return ;

    } 
    public List<String> validStrings(int n) {
         List<String> ans= new ArrayList<String>();
        find(n,"",ans);
        return ans;
    }
}