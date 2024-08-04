class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        new = []
        mod = 10**9 + 7
        for i in range(0,len(nums)):
            s = 0
            for j in range(i,len(nums)):
                s += nums[j]
                new.append(s)
        new.sort()
        # print(new)
        ans = 0
        for i in range(left-1,right):
            ans += new[i] 
        return ans  % mod  
