class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int c=0;

        for ( int i=0;i<n;i++ ) { 
            if( nums[i]<pivot ) a.add(nums[i]);
            if( nums[i]==pivot ) c++;
            if( nums[i]>pivot ) b.add(nums[i]);
        }

        while( c>0 ) {a.add(pivot);c--;}

        int in=0;
        for ( int i:a ) ans[in++]=i;
        for ( int i:b ) ans[in++]=i;

        return ans;
    }
}