class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        for i in range(len(prices)):
            if i == len(prices) -1 :
                break
            j = i+1
            while j < len(prices):
                if prices[j] > prices[i]:
                    j += 1
                else:
                    prices[i] = prices[i] - prices[j]
                    break
        return prices

        