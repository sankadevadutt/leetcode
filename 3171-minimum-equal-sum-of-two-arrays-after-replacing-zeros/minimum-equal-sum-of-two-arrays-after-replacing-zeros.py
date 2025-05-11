class Solution:
    def minSum(self, nums1: List[int], nums2: List[int]) -> int:
        sum1 = sum2 = 0
        zero1 = zero2 = 0

        for i in nums1:
            if i == 0:
                sum1 += 1
                zero1 += 1
            sum1 += i
        
        for i in nums2:
            if i == 0:
                sum2 += 1
                zero2 += 1
            sum2 += i

        if (zero1 == 0 and sum1 < sum2) or (zero2 == 0 and sum1 > sum2):
            return -1
        return max(sum1, sum2)