class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int n= nums.length;
        int[] e = new int[n/2];
        int[] o = new int[n/2];

        int a=0,b=0;
        for( int i:nums ) {
            if( i%2==0 ) e[a++]=i;
            else o[b++]=i;
        }

        int[] ans = new int[n];
        
        a=0;b=0;
        for ( int i=0;i<n;i++ ) { 
            if( i%2==0 ) ans[i]=e[a++];
            else ans[i] = o[b++];
        }

        return ans;
    }
}