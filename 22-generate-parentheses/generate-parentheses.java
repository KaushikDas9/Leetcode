class Solution {

    public static void find( int n,String str,List<String> ans , 
            int open , int close ) { 

        if ( str.length()==n*2 ) { 
            ans.add(str);
            return ;
        } 

        if( open<n ) find(n,str+"(",ans,open+1,close);
        if( open>close ) find(n,str+")",ans,open,close+1);


    }

    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        
        find(n,"",ans,0,0);
        return ans;
    }
}