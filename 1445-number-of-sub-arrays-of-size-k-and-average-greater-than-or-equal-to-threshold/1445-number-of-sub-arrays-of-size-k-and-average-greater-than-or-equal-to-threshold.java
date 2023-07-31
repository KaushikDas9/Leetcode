class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int avg,sum=0,count=0,j=0;

        for(int i=0 ; i< k-1 ; i++){sum += arr[i];}

        for(int i=k-1 ; i< arr.length ; i++)
        {
            sum += arr[i];
            avg = sum/k;
            if(avg >= threshold ) count++;
            sum -= arr[j++];
        }
        return count;
    }
}