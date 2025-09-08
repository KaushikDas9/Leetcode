class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        int t = n ;

        while(n > 0) {
            n--;
            if( n > 10 && find(n) && find( t - n ) ) {
                ans[0] = n;
                ans[1] = t - n;
                return ans;
            } else if( n < 10 && n != 0 ) {
                ans[0] = n;
                ans[1] = t - n;
                return ans;
            }
        }

        return ans;
    } 

    private static boolean find( int n ) {

        while( n > 0 ) {

            if( n % 10 == 0) return false;
            n /= 10;
        }

        return true;
    }  
}

// 9999 1