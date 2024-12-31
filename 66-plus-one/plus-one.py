class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:

        sum =0
        for i in range(0,len(digits)):
            n = len(digits)-i-1
            sum += digits[i] * (10**n)
        sum += 1
        ans = []
        
        ans = [int(d) for d in str(sum)]  
        return ans     