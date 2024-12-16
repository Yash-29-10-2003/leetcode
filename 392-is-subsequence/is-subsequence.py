class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        pointerS , pointerT = 0,0

        while pointerS < len(s) and pointerT < len(t):
            if s[pointerS] == t[pointerT]:
                pointerS += 1
            pointerT += 1
        
        if pointerS == len(s):
            return True
        else: return False

        