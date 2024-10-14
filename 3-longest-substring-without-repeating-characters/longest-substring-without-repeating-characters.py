class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        length = len(s)
        left, right = 0, length

        maxCount = 0

        while(left < right):
            ind = {}
            k = left
            while(k < right and s[k] not in ind):
                ind[s[k]] = k
                k += 1
            maxCount = max(maxCount, k - left)
            if k == right:
                return maxCount
            left = ind[s[k]] + 1
        return maxCount