class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        #setA = set(nums)
        minNum = 0
        maxNum = len(nums)
        for i in range(minNum , maxNum+2):
            if i in nums:
                continue
            else:
                return i