class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        L = 0
        window = set()

        for R in range(len(nums)):        
            if R - L > k:                  #if the diff bw the 2 pointers is bigger than out limit we just remove the element from the shorter index (left index) and increment the left index by one to slide our window to its currect maxm length.
                window.remove(nums[L])
                L += 1

            if nums[R] in window:
                return True
            else:
                window.add(nums[R])
        return False
        