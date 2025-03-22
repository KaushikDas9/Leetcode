class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        

        int n= nums.length;
        int i=0,j=n-1;

        while(i<n && j>-1) { 

            while( i<n && ( i%2==0&&nums[i]%2==0 ) )
            i += 2;
            while( j>-1 && ( j%2==1&&nums[j]%2==1 )   ) 
            j -= 2;

            if( i<n && j>=0 ) {

            
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            } else break;
        }

        return nums;
    }
}