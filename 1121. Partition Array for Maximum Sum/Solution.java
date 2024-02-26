class Solution {

    public static int find( int[] arr,int k,int index,Integer dp[] ) { 


        if( index == arr.length )  return 0;
        if( dp[index] != null ) return dp[index];
        
        int len =0;int maxAns= 0;int maxi = 0;

        for( int i=index;i<Math.min( index+k,arr.length );i++ ) { 

            len++;
            maxi = Math.max(maxi,arr[i]);
            int sum = maxi*len + find( arr,k,i+1,dp );
            maxAns = Math.max(maxAns,sum);
        } 

        return dp[index] = maxAns;

    }

    public int maxSumAfterPartitioning(int[] arr, int k) {

    Integer dp[] = new Integer[arr.length];
       return find( arr,k,0,dp );
    }
}