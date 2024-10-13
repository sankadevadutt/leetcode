import heapq
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        pq = []
        ans = 1
        for i in nums:
            heapq.heappush(pq,i)

        prev = heapq.heappop(pq)
        count = 1
        while pq:
            curr = heapq.heappop(pq)
            if curr-prev == 1:
                count += 1
            elif curr == prev:
                continue
            else:
                count = 1
            prev = curr
            ans = max(ans,count)
        
        return ans

