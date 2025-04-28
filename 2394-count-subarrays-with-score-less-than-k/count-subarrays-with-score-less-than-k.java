class Solution {
    public long countSubarrays(int[] nums, long k) {
        //brute force 
        //  int n = nums.length;
        // int ans = 0 ;
        // for ( int i = 0 ; i < n ; i++ ) {

        //     int sum = 0 ; int temp = 0 ;
        //     for ( int j = i ; j < n ; j++ ) {
        //         temp++;
        //         sum += nums[j];
        //         if( ( sum * temp ) < k ) ans++;
        //         else if ( ( sum * temp ) >= k ) break;

        //     }
        // }


        //optimal 
        long ans = 0 ;
        long sum = 0 ;int j = 0 ; 
        int n = nums.length;

        for( int i = 0 ; i < n ; i++ ) {

            sum += nums[i];
            long temp = sum * ( i - j + 1);

            while( temp >= k ) {

                sum -= nums[j++];
                temp = sum * ( i - j + 1);
            }
            ans += i-j+1 ;
        } 


        return ans;

    }
}