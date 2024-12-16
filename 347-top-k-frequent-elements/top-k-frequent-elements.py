class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mapA = {}
        #populate the map as integer : number of occurances for every k : v
        for i in nums:
            if i in mapA:
                mapA[i] += 1
            else:
                mapA[i] = 1
        
        res = []

        #make a new list for occurances by getting the values from the dict and sort them
        occurances = mapA.values()
        occurances = sorted(occurances)

        #get the key for k elements using the k values from the end of the sorted list
        for j in range(k):
            key = next((k for k, v in mapA.items() if v == occurances[len(occurances) - j - 1]), None)
            res.append(key)
            del mapA[key]            #delete k:v pairs after going thru them once
        
        return res
        
