class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        // int max_index =0; 
        // HashMap<Integer,Integer> map1= new HashMap<>();
        // HashMap<Integer,Integer> map2= new HashMap<>();

        // for( int[] i:nums1 ) { map1.put(i[0],i[1]); max_index=Math.max(max_index,i[0]); }
        // for( int[] i:nums2 ) { map2.put(i[0],i[1]); max_index=Math.max(max_index,i[0]); }
        
        // int[][] ans = new int[max_index][2];

        // for( int i=1;i<=max_index;i++ ) { 
        //     int s=0;
        //     s = (map1.getOrDefault(i, 0) + map2.getOrDefault(i, 0));
        //     ans[i-1][0] = i; ans[i-1][1] = s;
        // }

        // return ans;
        
        int i=0,j=0,in=0;
        int max_index= Math.max( nums1[nums1.length-1][0],nums2[nums2.length-1][0] ) ; 
        int[][] ans = new int[max_index][2];
        while( i<nums1.length&&j<nums2.length ) { 
            
            if( nums1[i][0]==nums2[j][0] ) { 
                ans[in][0] = nums1[i][0] ;
                ans[in][1] = nums1[i][1] + nums2[j][1] ;
                i++;j++;in++;
            } else if ( nums1[i][0]<=nums2[j][0] ) { 
                ans[in][0] = nums1[i][0] ; 
                ans[in][1] = nums1[i][1];
                i++;in++;
            } else if ( nums1[i][0]>=nums2[j][0] ) {
                ans[in][0] = nums2[j][0] ; 
                ans[in][1] = nums2[j][1];
                j++;in++;
            } 

        }

        while ( i<nums1.length )  { 
            ans[in][0] = nums1[i][0] ; 
            ans[in][1] = nums1[i][1];
            i++;in++;
        }

        while ( j<nums2.length )  { 
            ans[in][0] = nums2[j][0] ;
            ans[in][1] = nums2[j][1];
            j++;in++;
        }

        return Arrays.stream(ans)
        .filter(row -> row[0] != 0 || row[1] != 0)
        .toArray(int[][]::new);
        
    }
}