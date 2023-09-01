class Solution {
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];

        while(n>0) {
            int count=0;
            int temp = n;
            while( temp != 0 ) {
         
                if( temp%2 == 1 ) count++ ; 
                temp = temp/2;

            }
            ans[n--] = count;
        }
        return ans;
    }
}