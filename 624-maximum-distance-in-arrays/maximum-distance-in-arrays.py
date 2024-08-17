class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        boro = arrays[0][-1]
        choto = arrays[0][0]
        ans = 0
        for i in arrays[1:]:
            # for j in range(len(i)):
            ans = max( ans, max( (i[-1]-choto ) , ( boro - i[0] ))  )
            boro = max(boro,i[-1])
            choto = min(choto,i[0])
        return ans