class Solution(object):
    def minLength(self, s):
        st = []

        for i in s:
            if st and st[-1] == "A" and i == "B":
                st.pop()
            elif st and st[-1] == "C" and i == "D":
                st.pop()
            else:
                st.append(i)
        
        return len(st)