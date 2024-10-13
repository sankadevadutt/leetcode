import heapq
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        lt = []
        ans = []
        for i in nums:
            if i not in freq:
                freq[i] = 0
            freq[i] += 1
        
        for i in freq:
            heapq.heappush(lt,(-freq[i],i))
        while lt and k:
            freq, val = heapq.heappop(lt)
            ans.append(val)
            k-= 1
        return ans