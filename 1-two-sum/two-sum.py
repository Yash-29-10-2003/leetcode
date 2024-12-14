class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myDict = {}
        for i,v in enumerate(nums):
            curr = target-v
            if curr in myDict:
                return[i,myDict[curr]]
            
            myDict[v] = i
        

            
