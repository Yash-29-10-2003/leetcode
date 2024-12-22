class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        p1 , p2  = 0 , len(s)-1
        while p1 < p2:
            if not s[p1].isalnum():
                p1 += 1
                continue
            if not s[p2].isalnum():
                p2 -= 1
                continue
            if s[p1] == s[p2]:
                p1 += 1
                p2 -= 1
                continue
            else:
                return False
        return True
