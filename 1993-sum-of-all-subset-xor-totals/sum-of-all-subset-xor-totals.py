class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:

        subsets = []
        for r in range(len(nums) + 1):
            subsets.extend(itertools.combinations(nums, r))

        total=0
        for i in subsets:
            sum = 0
            for j in i :
                sum ^=j
            total+=sum
            
        return total