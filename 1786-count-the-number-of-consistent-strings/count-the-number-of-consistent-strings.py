class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        ans=0
        my_set=set(allowed)

        return sum(my_set>=set(i)  for i in words )