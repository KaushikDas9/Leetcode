class Solution(object):
    def minSwaps(self, s):

        n = len(s)
        o = 0
        c = 0
        ans = 0 
        j=n-1
        for i in range(n):
            if s[i] == "[" : 
                o +=1
            else:
                c += 1 
                if c > o :
                    while s[j] != "[":
                        j -= 1 
                    c -= 1
                    o += 1
                    ans += 1


        return ans

            
        