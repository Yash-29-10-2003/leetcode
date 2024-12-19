class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        setA = set()
        for num in nums:
            if num in setA:
                return num
            else:
                setA.add(num)