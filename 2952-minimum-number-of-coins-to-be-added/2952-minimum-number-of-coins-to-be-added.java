class Solution {
    public int minimumAddedCoins(int[] coins, int target) {

        Arrays.sort(coins);
        int max = 0; 
        int index=0;
        int count=0;
        while( max < target ) {

            if( index < coins.length && coins[index] <= max+1 ) {
                max += coins[index++];
            }else{
                max = 2*max +1 ;
                count++;
            }

        }

        return count;
    }
}