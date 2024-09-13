class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if m*n != len(original) : return []

        ans = [[] for _ in range(m)]
        index=0
        for i in range(m):
            for j in range(n):
                ans[i].append(original[index])
                index += 1 
        return ans        

       