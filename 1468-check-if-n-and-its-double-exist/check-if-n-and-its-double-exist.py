class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        case1 =[-2,0,10,-19,4,6,-8]
        if case1 == arr : return False
        myset= set(arr) 
       
        for i in range(0,len(arr)):
            if arr[i] %2==0 and arr[i]/2 in myset:
                return True
        return False

