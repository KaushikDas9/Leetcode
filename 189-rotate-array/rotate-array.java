class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        int ans[] = new int[n];

        for ( int i=0;i<n;i++ )  { 
            ans[(i+k)%n]=nums[i];
        }
        int j=0;
        for( int i:ans) nums[j++]=i;
    }
}