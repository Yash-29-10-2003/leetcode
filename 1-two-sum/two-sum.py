class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapA = {}
        for i in range(0,len(nums)):
            temp = target - nums[i]   #temp + n = target
            if temp in mapA:
                return mapA[temp] , i
            else:
                mapA[nums[i]] = i
            


        