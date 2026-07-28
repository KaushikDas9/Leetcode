class Solution {
    public int maxProduct(int n) {
        
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        while (n > 0) {
            int t = n % 10;

            if( t > b) {
                a = b;
                b = t;
            } else if(t > a) {
                a = t;
            }

            n = n / 10;
        }

        return a * b;
    }
}