import heapq
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        count = 0
        heapq.heapify(nums)
        while nums[0] < k:
            v1 = heapq.heappop(nums)
            v2 = heapq.heappop(nums)
            heapq.heappush(nums, v1*2+v2)
            count += 1

        return count