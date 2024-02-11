class Solution {

    public int find( int i , int tar , int[] arr ) { 

        int n =arr.length;
        
        if(  i<0 ) return 0 ;
        if( i==n  ) { 
            if( tar  == 0  )
            return 1;
            else 
            return 0 ;
        }

        int ntake =find( i+1,tar-arr[i],arr );
        int take= find( i+1,tar+arr[i],arr );
        


        return take + ntake ;
         

    }
    public int findTargetSumWays(int[] nums, int target) {


        return find( 0,target,nums  ) ;       
    }
}