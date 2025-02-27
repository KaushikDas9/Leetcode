class Solution {

    public static void find( int n,int[] nums,List<Integer> s,List<List<Integer>> ans ) { 
        
        if( n<0 ) {
            if( !ans.contains(s) ) 
                ans.add(new ArrayList<>(s));
            return;
        }

        s.add(nums[n]);
        find(n-1,nums,s,ans);
        s.remove(s.size()-1);
        find(n-1,nums,s,ans);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> store = new ArrayList<>();
        int n = nums.length;
        find(n-1,nums,store,ans);
        return ans;
    }
}