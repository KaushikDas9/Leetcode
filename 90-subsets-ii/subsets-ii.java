class Solution {

    public static void find( int n,int[] nums,List<Integer> s,List<List<Integer>> ans ) { 
        
            ans.add(new ArrayList<>(s));
   

        for( int i=n;i<nums.length;i++ ) {

            if( i>n && nums[i]==nums[i-1] ) continue;

            s.add(nums[i]);
            find(i+1,nums,s,ans);
            s.remove(s.size()-1);
        }

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> store = new ArrayList<>();
        int n = nums.length;
        find(0,nums,store,ans);
        return ans;
    }
}