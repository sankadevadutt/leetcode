class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        k = k-1
        invert = False

        while n > 1:
            total = 2**n -1
            mid = total//2

            if mid == k:
                return "0" if invert else "1"
            elif mid < k:
                invert = not invert
                k = total - k -1
            n -= 1
        
        return "1" if invert else "0" 
# 1 - 1
# 2 - 3
# 3 - 7
# 4 - 15
# 5 - 31

# 2^n - 1
        
        
        
        