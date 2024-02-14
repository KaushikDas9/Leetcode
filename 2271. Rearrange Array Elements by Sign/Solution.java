class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int pos_ind = 0; 
        int neg_ind =0;
        for( int i=0;i<n;i++ ) { 

            if( nums[i] > 0 ) pos[pos_ind++] =nums[i];
            else neg[neg_ind++] =nums[i];
        }
        int ans[] = new int[n] ;
        int j=0;
        for( int i=0;i<n/2;i++ ) { 
            ans[j++] = pos[i];
            ans[j++] = neg[i];
        }

        return ans;
        
    }
}