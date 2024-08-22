class Solution:
    def findComplement(self, num: int) -> int:

        bi= bin(num)[2:]
        ans=""
        for i in range(len(bi)):
            if bi[i]=="0":
                ans += "1"
            else:
                ans += "0"

        return int(ans , 2)        