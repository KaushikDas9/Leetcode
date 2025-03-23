class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        

        int[] ans = new int[2];

        int ans1=0,ans2=0;
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for ( int i=0;i<nums1.length;i++ ) s1.add(nums1[i]);
        for ( int i=0;i<nums2.length;i++ ) s2.add(nums2[i]);

        

        for ( int i=0;i<nums1.length;i++ ) if( s2.contains(nums1[i]) ) ans1++;
        for ( int i=0;i<nums2.length;i++ ) if( s1.contains(nums2[i]) ) ans2++;


        return new int[]{ans1,ans2};
        
    }
}