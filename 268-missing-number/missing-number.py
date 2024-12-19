class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        setA = set(nums)
        minNum = 0
        maxNum = max(setA)
        for i in range(minNum , maxNum+2):
            if i in setA:
                continue
            else:
                return i