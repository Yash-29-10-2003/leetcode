class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        setA = set()
        for _ in nums:
            if _ in setA:
                return True
            else:
                setA.add(_)
        return False

