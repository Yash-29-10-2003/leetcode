class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myDict = {}
        curr = None
        length = len(nums)
        ans = [0] * 2
        for i in range(len(nums)):
            curr = target - nums[i]
            if curr in myDict:
                ans[0] = i
                ans[1] = myDict[curr]
            else:
                myDict[nums[i]] = i
        return ans

            
