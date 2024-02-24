class Solution {

    static Integer dp[] = new Integer[1000000];

    public static int findPower( int num ) { 

        if( num == 1 ) return 0; 
        if( dp[num] != null ) return dp[num];


        int take = (num % 2 == 0 ? findPower (num / 2) : findPower (num * 3 + 1))+1 ;

        return dp[num]= take ;
        
    }
    public int getKth(int lo, int hi, int k) {


        int arr[][] = new int[hi-lo+1][2];
        
        for( int i=lo;i<=hi;i++ ) {

            int temp = findPower( i );
            arr[i-lo][0] = i;
            arr[i-lo][1] = temp;
        }   

        Arrays.sort(arr,(a,b)-> a[1]-b[1] );
        return arr[k-1][0];
        
    }
}