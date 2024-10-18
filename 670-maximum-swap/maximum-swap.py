class Solution:
    def maximumSwap(self, num: int) -> int:
        s = list(str(num))
        n = len(s)
        max_idx = n - 1
        idx1, idx2 = 0, 0
        
        for i in range(n - 1, -1, -1):
            if s[i] > s[max_idx]:
                max_idx = i
            elif s[i] < s[max_idx]:
                idx1, idx2 = i, max_idx
        
        s[idx1], s[idx2] = s[idx2], s[idx1]
        
        return int(''.join(s))