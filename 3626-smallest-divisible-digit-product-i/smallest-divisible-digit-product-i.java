class Solution {
    public int smallestNumber(int n, int t) {
        
        for (int i = n; i <= 100; i++) {
            if(digitProduct(i) % t == 0) return i;
        }

        return -1;
    }

    private static int digitProduct(int n) {

        int pro = 1;

        while(n != 0) {

            pro *= n % 10 ;
            n /= 10;
        }

        return pro;
    }
}