class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        setA = set(nums)
        maxNum = len(setA)
        for i in range(0, maxNum+2):
            if i in setA:
                continue
            else:
                return i