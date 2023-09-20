class Solution {
    public int minOperations(int[] nums, int x) {
        int total=-x;
        for( int i :nums) total += i;
        if( total==0 ) return nums.length;

        int maxLen=0;
        int currSum=0,j=0;
        for( int i=0;i<nums.length;i++ ) { 
                currSum += nums[i];
                while( j<=i && currSum > total ) { 
                    currSum -= nums[j++];
                }
                if( currSum == total ) maxLen= Math.max(maxLen,i-j+1);
        }

        if( maxLen!=0 ) return nums.length-maxLen;
        return -1; 
    }
}