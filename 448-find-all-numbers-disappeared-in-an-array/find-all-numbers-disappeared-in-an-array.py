class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        setA = set(nums)
        res = []
        for i in range(1, len(nums) + 1):
            if i in setA:
                continue
            else:
                res.append(i)
        return res

        