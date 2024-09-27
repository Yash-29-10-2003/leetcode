# a 65

# method - map with ascii
# mehtod - add individual into sets then set difference 

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        x = [0] * 26
        y = [0] * 26

        if len(s) != len(t):
            return False

        for ch in s:
            x[ord(ch) - 97] += 1
        
        for ch in t:
            y[ord(ch) - 97] += 1
        
        return x == y


        