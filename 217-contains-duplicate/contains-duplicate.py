class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        setA = set()
        for i in range(len(nums)):
            if nums[i] in setA:
                return True
            else:
                setA.add(nums[i])
        return False