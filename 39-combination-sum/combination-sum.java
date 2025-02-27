class Solution {

    public static void find(int n,int[] arr, int tar,List<Integer> store,List<List<Integer>> ans) { 
        

         if( (tar != 0 && n==-1) || tar<0 ) {
            return;
        }

        if( tar ==0 ) { 
            ans.add(new ArrayList<>(store));
            return ;
        }
         

        
        if(  tar-arr[n]>=0 ) {
            store.add(arr[n]);
            find( n,arr,tar-arr[n],store,ans );
            store.remove(store.size()-1);
        }
        find( n-1,arr,tar,store,ans );

        return ;
    }
    public List<List<Integer>> combinationSum (int[] candidates, int target) {

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> store = new ArrayList<Integer>();
        find( candidates.length-1,candidates,target,store,ans );
        return ans;
    }
}