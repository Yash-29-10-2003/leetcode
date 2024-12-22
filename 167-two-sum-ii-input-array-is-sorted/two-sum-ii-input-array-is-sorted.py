class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        p1 = 0
        p2 = len(numbers)-1
        while p2 > p1:
            if numbers[p1] + numbers[p2] == target:
                return p1+1 , p2+ 1
            if numbers[p1] + numbers[p2] > target:
                p2 -= 1
            if numbers[p2] + numbers[p1] < target:
                p1 += 1
            
