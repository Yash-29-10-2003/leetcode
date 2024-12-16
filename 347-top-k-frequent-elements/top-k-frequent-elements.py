class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mapA = {}
        for i in nums:
            if i in mapA:
                mapA[i] += 1
            else:
                mapA[i] = 1
        
        res = []
        occurances = mapA.values()
        occurances = sorted(occurances)
        for j in range(k):
            key = next((k for k, v in mapA.items() if v == occurances[len(occurances) - j - 1]), None)
            res.append(key)
            del mapA[key]
        
        return res
        
