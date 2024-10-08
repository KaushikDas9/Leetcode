class Solution(object):
    def minSwaps(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Convert the string to a list of characters
        s = list(s)
        
        n = len(s)
        o = 0
        c = 0
        ans = 0 
        j = n - 1
        
        for i in range(n):
            if s[i] == "[" : 
                o += 1
            else:
                c += 1 
                if c > o :
                    while s[j] != "[":
                        j -= 1
                    temp = s[i]
                    s[i] = s[j]
                    s[j] = temp
                    c -= 1
                    o += 1
                    ans += 1
        
        return ans