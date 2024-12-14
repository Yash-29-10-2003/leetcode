class Solution:
    def secondHighest(self, s: str) -> int:
        s1 = []
        for i in range(0,len(s)):
            if s[i] in '1234567890':
                s1.append(int(s[i]))
        count = 0
        temp = -1
        for _ in s1:
            if _ == max(s1) and count == 0:
                count+= 1
                continue
            if _ > temp and _ < max(s1):
                temp = _
        return temp
            


        