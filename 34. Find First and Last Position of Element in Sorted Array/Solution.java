class Solution {


    int findFirst( int[] nums, int target ) { 

        int n = nums.length;
        int left = 0;
        int right = n-1;
        

        while( left <= right  ) { 

            int  mid = left + (right - left )/2;

            if( target < nums[mid] ) {

                right = mid-1;                
            }else if ( target > nums[mid]) { 
                left = mid+1;
            }else { 

                if(mid == 0 || nums[mid-1] != target ) {
                    return mid ;
                }else { 
                    right = mid-1;
                }

            }
            mid = (left+right)/2;
        }

        return -1;
        
    }

     int findSecond( int[] nums, int target ) { 

        int n = nums.length;
        int left = 0;
        int right = n-1;
       

        while( left <= right  ) { 

           int  mid = left + (right - left )/2;

            if( target < nums[mid] ) {

                right = mid-1;                
            }else if ( target > nums[mid]) { 
                left = mid+1;
            }else { 

                if(mid == n-1 || nums[mid+1] != target ) {
                    return mid;
                }else { 
                    left = mid+1;
                }

            }
           
        }

        return -1;
        
    }



    public int[] searchRange(int[] nums, int target) {

        int[] ans= new int[2];
        Arrays.fill(ans,-1);
        // int n = nums.length;
        // int left = 0;
        // int right = n-1;
        // int mid =  (n)/2;


        int firstIndex =  findFirst( nums,target);
        int secondIndex = findSecond ( nums,target );

       ans[0] = firstIndex;
       ans[1] = secondIndex;

        return ans;
    }
}