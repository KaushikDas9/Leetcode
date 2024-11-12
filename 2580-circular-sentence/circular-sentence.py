class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        temp = []
        for i in range(0,len(sentence)):
            if sentence[i] == " ":
                temp.append(sentence[i-1])
                temp.append(sentence[i+1])

        print(temp)   
      

        for i in range(0,len(temp)-1,2):
            if temp[i].lower() != temp[i+1].lower():
                return False
           
        # if len(temp) == 0:
        #     if sentence[-1] != sentence[0]: return False
        # elif sentence[-1] != sentence[-1]:return False
        if sentence[-1] != sentence[0]:return False
        return True