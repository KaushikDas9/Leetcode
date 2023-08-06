class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0,ans=0;
        for(int i=0 ; i<arr.length;i++)
        {
            int k=0;
            for(int j=i;j<arr.length;j++)
            {
                sum += arr[j];
                if(k++%2==0) ans+=sum;
            }
            sum=0;
        }
        return ans;
    }
}