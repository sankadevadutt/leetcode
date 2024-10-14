class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l,r = 0, 1
        maxProfit = 0
        while l < len(prices):
            while(l < len(prices)-1 and prices[l] >= prices[l+1]):
                l += 1
            r = l + 1
            while(r<len(prices) and prices[r] > prices[l]):
                maxProfit = max(maxProfit, prices[r]-prices[l])
                r += 1
            l = r
        return maxProfit
        