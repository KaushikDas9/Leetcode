class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        
        while arr : 
          i = arr.pop()
          if i in target:
            target.remove(i)
          else:
            return False
        return True    

