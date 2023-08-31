class Solution {
public static void find(int n ,int k , ArrayList<Integer> ds, int tar , List<List<Integer>> ans) {
        
       
        if( tar==0 && k==0 ) {
            ans.add( new ArrayList<Integer>(ds)); return;
        }

        if( n == 10 ||  tar < 0 || k < 0  ) return ;
              
        ds.add(n);
        find(n+1,k-1,ds,tar-n,ans);
        ds.remove(ds.size()-1);
        
        find(n+1,k,ds,tar,ans);
        
        return ;
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        find( 1 , k , new ArrayList<Integer>() , n , ans );
        return ans;
    }
}