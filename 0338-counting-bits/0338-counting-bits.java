class Solution {
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
        ans[0]=0;
        int j=0;
        while(n>0) {
            int count=0;
            int temp = n;
            // System.out.println("n:" + n);
            while( temp != 0 ) {
         
                if( temp%2 == 1 ) count++ ; 
                // System.out.println("temp:" + temp + "  count:"+count);
                temp = temp/2;

            }
            ans[ans.length-1-j] = count;
            j++;
            n--;
        }
        return ans;
    }
}