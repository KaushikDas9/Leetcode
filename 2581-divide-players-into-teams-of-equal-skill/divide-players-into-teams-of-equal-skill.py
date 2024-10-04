class Solution:
    def dividePlayers(self, skill: List[int]) -> int:
        total = sum(skill)
        n = len(skill)
        teams = n/2
        if n == 2 : return skill[0]*skill[1]
        if total%teams != 0 : return -1
        skill.sort()
        ans = 0
        curr = 0
        prev = 0
        for i in range(int(teams)):

            if i == 0 : curr = skill[i] + skill[n-i-1]
            if i > 0 : 
                curr = skill[i] + skill[n-i-1]
                if prev != curr : return -1

            ans += skill[i] * skill[n-i-1]
            prev = curr




        return ans

        # i=2 curr = 3 ,3 prev =2,4
        # 1 2 3 3 4 5 
        # 1 2 2 5 