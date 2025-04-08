class Solution {
    public int minimumOperations(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for ( int i = 0 ; i < n ; i++ ) {
            map.put( nums[i] , map.getOrDefault( nums[i] , 0 ) + 1 );
        }

        int ans=0,i=0,j=0;

        while (  i<n && map.size() != ( n - i ) ) { 
            
            i = i + 3;

            while ( !map.isEmpty() && j < i && j < n) { 

                if( map.get(nums[j]) > 1 ) {
                    map.put( nums[j] , map.get(nums[j])-1 );
                } else { 
                    map.remove( nums[j] );
                }
                j++;
            }
            // System.out.println(map);

            ans++;
            
        }

        return ans;
    }
}