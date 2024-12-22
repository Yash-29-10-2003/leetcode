class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        sqr = [0] * len(nums)
        count = 0
        for i in range(0, len(nums)):
            sqr[i] = nums[i] ** 2
        
        return sorted(sqr)
        