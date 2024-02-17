class Solution {
    public int search(int[] nums, int target) {
        
         int n = nums.length;
        int left = 0;
        int right =n-1;

        if( n==1 ) { 
            if( nums[0]  == target) return 0;
            return -1;
        }
     
        while( left<= right ) { 

            int mid = (left+right)/2;


           if( nums[mid] == target ) {
               return mid ;
           } 

        if( nums[left] <= nums[mid]  ) { 

                if( ( nums[left] <= target ) && ( nums[mid] > target ) ) { 
                    right = mid-1;
                }else { 
                    left = mid +1 ;
                }
            }
            if( nums[mid] <= nums[right] ) { 

                if( ( nums[mid] < target ) && ( nums[right] >= target ) ) { 
                    left = mid+1;
                }else { 
                    right = mid -1 ;
                }

            }
    

        }

        return -1;

    }
}