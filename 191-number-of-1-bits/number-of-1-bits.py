from collections import Counter
class Solution:
    def hammingWeight(self, n: int) -> int:
        # ans = 0

        # while n > 0:
        #     ans += 1
        #     n = n&(n-1)

        # return ans

        s = bin(n)[2:]
        counter = Counter(s)
        return counter['1']
