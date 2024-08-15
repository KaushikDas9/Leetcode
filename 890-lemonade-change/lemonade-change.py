class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        my_list= list()

        for i in range(0,len(bills)):

            if bills[i] == 5:
                my_list.append(5)
               
            elif bills[i] == 10:
                if 5 in my_list:
                    my_list.append(10)
                    my_list.remove(5)
                else:
                    return False

            else: 
                if my_list.count(10)>=1 and my_list.count(5)>=1:
                    my_list.append(20)
                    my_list.remove(10)
                    my_list.remove(5)
                elif my_list.count(5)>=3:
                    my_list.append(20)
                    for i in range(3): my_list.remove(5)
                else:
                    return False  

        return True
        