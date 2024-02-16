class Solution {


    boolean search( int arr[] , int value ) { 
            int n= arr.length;
            int left=0,right=n-1,mid= (n)/2 ;

            while( left  <= right ) { 

                if( value < arr[mid]) {

                       right = mid-1;
                       mid =  (left+right)/2;

                }else if ( value > arr[mid]) {
                    left=mid+1;
                    mid=(left+right)/2;
                }else {
                    return true;
                }
            }

        return false;
    }

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        
 
        for ( int i=0;i<=nums.length;i++ ) { 

            if( !search(nums,i)) return i;
        }

        return -1;
    }
}