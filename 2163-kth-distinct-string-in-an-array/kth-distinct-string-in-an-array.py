class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        my_set = [i for i in arr if arr.count(i)==1] 

        if len(my_set)<k :
            return ""
        else:    
            for i in arr:
                if (k==1) and (i in my_set):
                    return i
                if i in my_set:
                    k -=1
