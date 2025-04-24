class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for( int i : nums ) set.add( i );


        HashMap< Integer , Integer > map = new HashMap<>();
        int ans = 0 , j = 0 ;
        for ( int i = 0 ; i < nums.length; i++ ) { 

            map.put( nums[i] , map.getOrDefault( nums[i] , 0 ) + 1 );

            while ( map.size() == set.size() ) { 

                ans += nums.length - i ;
                map.put( nums[j] , map.getOrDefault( nums[j] , 0 ) - 1 );
                map.remove( nums[j] , 0 );
                j++;

            }
        }

        return ans;
    }
}