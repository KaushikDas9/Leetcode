class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        b = bin(n)[2:] 
        b = b.zfill(32)  
        b = b[::-1]  
        ans = int(b, 2)  
        return ans

