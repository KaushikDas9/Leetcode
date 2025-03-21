class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0][0];
        }

        int index1 = 0, index2 = 0, resultIndex = 0;
        int maxIndex = Math.max(nums1[nums1.length - 1][0], nums2[nums2.length - 1][0]);
        int[][] ans = new int[maxIndex + 1][2];

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1][0] == nums2[index2][0]) {
                ans[resultIndex][0] = nums1[index1][0];
                ans[resultIndex][1] = nums1[index1][1] + nums2[index2][1];
                index1++;
                index2++;
            } else if (nums1[index1][0] <= nums2[index2][0]) {
                ans[resultIndex][0] = nums1[index1][0];
                ans[resultIndex][1] = nums1[index1][1];
                index1++;
            } else {
                ans[resultIndex][0] = nums2[index2][0];
                ans[resultIndex][1] = nums2[index2][1];
                index2++;
            }
            resultIndex++;
        }

        while (index1 < nums1.length) {
            ans[resultIndex][0] = nums1[index1][0];
            ans[resultIndex][1] = nums1[index1][1];
            index1++;
            resultIndex++;
        }

        while (index2 < nums2.length) {
            ans[resultIndex][0] = nums2[index2][0];
            ans[resultIndex][1] = nums2[index2][1];
            index2++;
            resultIndex++;
        }

        int[][] result = new int[resultIndex][2];
        System.arraycopy(ans, 0, result, 0, resultIndex);
        return result;
    }
}