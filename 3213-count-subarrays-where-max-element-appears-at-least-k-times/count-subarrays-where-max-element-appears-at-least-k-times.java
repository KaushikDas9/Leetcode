class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int maxElement =0 ; 
        for( int i : nums) maxElement = Math.max( maxElement,i ); 

        int count =0 ;
        long ans = 0; 
        int j=0;int n = nums.length;

        for( int i=0;i<n;i++ ) { 


            if( nums[i] == maxElement ) count++;
            

                while (  count >= k) { 
                     if(  count >= k ) ans+= n-i-1+1 ;
                    if( nums[j] == maxElement ) count--;
                    j++;
                   
                }

            
        }        

        return ans ;
    }
}