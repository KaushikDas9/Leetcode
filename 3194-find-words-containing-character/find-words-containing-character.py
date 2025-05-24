class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:

        ans=[]
        for i in range(0,len(words)):
            te=words[i]
            if x in te:
                ans.append(i)
        return ans