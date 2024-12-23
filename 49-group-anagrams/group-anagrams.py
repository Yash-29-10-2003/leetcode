class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dictA = {}
        for s in strs:
            temp = ["0"]* 26
            for i in range(len(s)):
                temp[ord(s[i]) - 97] += "1"
            temp = "".join(temp)
            if temp in dictA:
                dictA[temp].append(s)
            else:
                dictA[temp] = [s]
        res = []
        for k,v in dictA.items():
            res.append(v)
        return res
        

        