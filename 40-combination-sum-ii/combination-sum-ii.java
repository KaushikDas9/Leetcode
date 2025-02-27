class Solution {
    public static void find(int n,int[] arr, int tar,List<Integer> store,List<List<Integer>> ans) { 

        if( tar ==0 ) { 
            ans.add(new ArrayList<>(store));
        }
         
        for ( int i=n;i<arr.length;i++ ) { 

            if( i>n && arr[i]==arr[i-1] ) continue;
            if( tar<0 ) break;
            
            store.add(arr[i]);
            find(i+1,arr,tar-arr[i],store,ans);
            store.remove(store.size()-1);
        }

        return ;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates); 
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> store = new ArrayList<Integer>();
        find( 0,candidates,target,store,ans );
        return ans;   
    }
}