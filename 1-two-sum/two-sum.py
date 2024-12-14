class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myDict = {}
        curr = None
        length = len(nums)
        for i in range(len(nums)):
            curr = target - nums[i]
            if curr in myDict:
                return[i , myDict[curr]]
            else:
                myDict[nums[i]] = i
        return ans

            
