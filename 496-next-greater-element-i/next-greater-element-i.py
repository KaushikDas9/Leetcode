class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
      
        n1 = len(nums1)
        n2 = len(nums2)
        ans = []
        for i in nums1:
            for j in range(n2):
                if i == nums2[j] :
                    while j<n2 and nums2[j] <= i :
                        j += 1
                    if j<n2 and nums2[j] > i :
                        ans.append(nums2[j])
                    else:
                        ans.append(-1)    
        return ans