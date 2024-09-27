class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        setA = set()
        for n in nums :
            if n in setA :
                return True
            else :
                setA.add(n)
        return False
