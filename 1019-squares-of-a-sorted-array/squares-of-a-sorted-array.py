class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        sqr = [0] * len(nums)
        p1, p2 = 0, len(nums) - 1
        curr = len(nums) - 1
        
        while p1 <= p2:
            if abs(nums[p1]) < abs(nums[p2]):
                sqr[curr] = nums[p2] ** 2
                p2 -= 1
                curr -= 1
            elif abs(nums[p1]) > abs(nums[p2]):
                sqr[curr] = nums[p1] ** 2
                p1 += 1
                curr -= 1
            else:
                sqr[curr] = nums[p2] ** 2
                p2 -= 1
                curr -= 1
        
        return sqr

        