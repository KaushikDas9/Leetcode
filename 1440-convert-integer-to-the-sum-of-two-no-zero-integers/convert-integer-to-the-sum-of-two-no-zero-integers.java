class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        int temp = n ;

        while(temp > 0) {
            temp--;
            if( temp > 10 && find(temp) && find( n - temp ) ) {
                ans[0] = temp;
                ans[1] = n - temp;
                return ans;
            } else if( temp < 10 && temp != 0 ) {
                ans[0] = temp;
                ans[1] = n - temp;
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