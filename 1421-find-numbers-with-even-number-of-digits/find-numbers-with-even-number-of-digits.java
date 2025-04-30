class Solution {

    public static int digitCount ( int num ) {

        int count = 0 ;

        while ( num != 0 ) {
            num /= 10;
            count ++;
        }
        return count;
    } 

    public int findNumbers(int[] nums) {
    
        int ans = 0;

        for ( int i:nums ) {
            if( digitCount(i) % 2 == 0 ) ans++;
        }
        return ans;
    }
}

// 7896 / 10 = 789 / 10 = 78 / 10 = 7 / 10 = 0