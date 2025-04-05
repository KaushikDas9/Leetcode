class Solution {

    public static int find( int n,int xor,int[] arr ) { 

        if( n==arr.length ) return xor;

        int take = find( n+1,arr[n]^xor,arr );
        int ntake = find( n+1,xor,arr );

        return take+ntake;
    }

    public int subsetXORSum(int[] nums) {
        return find( 0,0,nums);
    }
}