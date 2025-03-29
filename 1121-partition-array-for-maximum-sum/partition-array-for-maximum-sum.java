class Solution {

    public static int find( int i,int k,int[] arr,Integer[] dp ) { 

        int n = arr.length;

        if( i==n  ) return 0;
        if( dp[i]!=null ) return dp[i];

        int max = -(int)10e9;
        int max_value = 0,len=0;

        for( int p=i;p< Math.min(n,i+k) ;p++ ) { 

            len++;
            max_value = Math.max(max_value,arr[p]);
            int step = (max_value*len) + find( p+1,k,arr,dp);
            max = Math.max(max,step);
        }

        return dp[i]=max;

    }


    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        int n = arr.length;
        Integer[] dp = new Integer[n];
        return find(0,k,arr,dp);
    }
}