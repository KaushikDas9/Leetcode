class Solution {
    static int mod = (int)(1e9+7);
    public static int find( int low, int high, int zero, int one,int s,Integer[] dp  ) { 
        
        // if( s>=low&&s<=high ) return 1;
        if( s>high ) return 0;
        if( dp[s]!=null ) return dp[s];

        int count = 0;
        if (s >= low && s <= high) count = 1;
        
        if( s+zero<=high ) {
            count = count+find(low,high,zero,one,s+zero,dp);
        } 

        if(  s+one<=high ) {
            count = count+find(low,high,zero,one,s+one,dp);
        } 


        return dp[s]=(count)%mod;
        
    }
    public int countGoodStrings(int low, int high, int zero, int one) {

        Integer[] dp = new Integer[high+1];
        return find( low,high,zero,one,0,dp );
    }
}