class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        if n <= 1 or k == 0:
            return nums
        k = k % n   # removes redundant rotation (only rotates for remainder of total rotations / size of array)

        def reverseArray(left, right):
            while left < right:
                nums[right] , nums[left] = nums[left] , nums[right]
                left += 1
                right -= 1

        reverseArray(0 , n - 1)
        reverseArray(0 , k-1)
        reverseArray(k , n - 1)
    
        

        