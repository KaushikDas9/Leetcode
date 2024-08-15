class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        five = 0
        ten =0
        twen =0

        my_list= list()

        for i in range(0,len(bills)):

            if bills[i] == 5:
                five +=1
                # my_list.append(5)
               
            elif bills[i] == 10:
                if five>=1:
                    ten += 1
                    five -= 1
                    # my_list.append(10)
                    # my_list.remove(5)
                else:
                    return False

            else: 
                if ten >= 1 and five>=1:
                    twen +=1
                    ten -=1
                    five -= 1
                    # my_list.append(20)
                    # my_list.remove(10)
                    # my_list.remove(5)
                elif five>=3:
                    twen += 1
                    five -= 3
                    # my_list.append(20)
                    # for i in range(3): my_list.remove(5)
                else:
                    return False  

        return True
        