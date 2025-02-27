class Solution {
    public static void find(int n,int[] arr, int tar,List<Integer> store,List<List<Integer>> ans,int k) { 
        

         if( (tar != 0 && n==-1) || tar<0 ) {
            return;
        }

        if( tar ==0 && store.size()==k ) { 
            ans.add(new ArrayList<>(store));
            return ;
        }
        if( tar ==0 && store.size()!=k ) { 
            return ;
        }
         

        
        if(  tar-arr[n]>=0 && arr[n] <=9 ) {
            store.add(arr[n]);
            find( n-1,arr,tar-arr[n],store,ans,k );
            store.remove(store.size()-1);
        }
        find( n-1,arr,tar,store,ans,k );

        return ;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {

        int[] arr = new int[n];
        for ( int i=0;i<n;i++) arr[i]=i+1; //[1,2,3,4,5,6,7]

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> store = new ArrayList<Integer>();
        find( arr.length-1,arr,n,store,ans,k );
        return ans;
    }
}