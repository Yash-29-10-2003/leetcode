class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        #brute force
        numSorted = sorted(nums)
        res = []
        mapA = {}
        for n in range(0, len(numSorted)):
            if numSorted[n] not in mapA:   
                # we only update for the first occuracnce of an element to mitigate errors due to duplicate numbers
                mapA[numSorted[n]] = n
        for m in nums:
            res.append(mapA[m])
        return res

