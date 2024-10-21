import heapq
class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        lt = []
        left, right = 0,len(nums)

        while(left < right):
            start = nums[left]
            left += 1
            length = 1
            while(left < right and nums[left] == start+length):
                left += 1
                length+=1
            if start != nums[left-1]:
                lt.append(f'{start}->{nums[left-1]}')
            else:
                lt.append(f'{start}')
            
        return lt

