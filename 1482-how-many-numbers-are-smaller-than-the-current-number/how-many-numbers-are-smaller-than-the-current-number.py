class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        #brute force
        numSorted = sorted(nums)
        res = []
        mapA = {}
        for n in range(0, len(numSorted)):
            mapA[n] = numSorted[n]
        for m in nums:
            key = next((k for k, v in mapA.items() if v == m), None)
            res.append(key)
        return res
