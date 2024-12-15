class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.rstrip()
        list = s.split(" ")
        return len(list[-1])
        