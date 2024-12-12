class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        
        word = ""
        bag = list()
        for i in sentence:
            if i != " ":
                word += i
            else:
                bag.append(word)
                word =""
        bag.append(word)

        ans = 0
        for i in bag:
          
            for j in range( 0,len(i) ):
                if i.startswith(searchWord):
                    return ans+1
            ans += 1

        return -1    