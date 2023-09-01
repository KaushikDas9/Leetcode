class Solution {

     public static void find(int index,int target,int[] arr, List<List<Integer>> ans , List<Integer> ds)
    {             
          if(target == 0) 
           {                      
               ans.add(new ArrayList<>(ds));                     
               return ;
           }
                    
               
                for(int i=index; i<arr.length ;i++)
                {
                    if(i> index && arr[i] == arr[i-1]) {continue;}
                    if(target <= 0) {break ;}

                    ds.add(arr[i]);
                    find(i+1,target-arr[i],arr ,ans,ds );
                    ds.remove(ds.size()-1); 
                    
                }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

            Arrays.sort(candidates); 
            List<List<Integer>> ans = new ArrayList<>();

            find(0,target,candidates,ans,new ArrayList<>());
           
            return ans;
    }
}