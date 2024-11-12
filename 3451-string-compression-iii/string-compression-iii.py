class Solution:
    def compressedString(self, word: str) -> str:
        
        temp = 1
        ans = ""
        for i in range(0,len(word)-1):
            if word[i] == word[i+1]:
                temp += 1
                if temp == 10:
                    ans += "9" + word[i]
                    temp = 1
            else:
                ans += str(temp)
                ans += word[i]
                temp = 1
        ans += str(temp)
        ans += word[-1]
        return ans