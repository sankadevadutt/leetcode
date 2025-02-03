class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        maX = 1
        n = len(nums)
        start = 0

        while(start < n):
            left,right = start,start+1
            while(right < n and nums[left]<nums[right]):
                left += 1
                right += 1
            
            maX = max(maX, right-start)
            start = right

        start = 0
        while(start < n):
            left,right = start,start+1
            while(right < n and nums[left]>nums[right]):
                left += 1
                right += 1
            
            maX = max(maX, right-start)
            start = right

        
        return maX