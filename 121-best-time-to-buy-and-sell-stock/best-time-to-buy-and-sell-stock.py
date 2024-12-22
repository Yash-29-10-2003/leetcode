class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        p1 = 0
        p2 = 1
        maxProfit = 0
        while p2 < len(prices):
            if prices[p1] < prices[p2]:
                maxProfit = max(prices[p2] - prices[p1], maxProfit)
            else:
                p1 = p2
            p2 += 1
        return maxProfit


            