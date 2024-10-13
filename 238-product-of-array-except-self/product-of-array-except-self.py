class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        isZero = False
        overallProd = 1
        length = len(nums)

        for i in nums:
            if i!=0:
                overallProd *= i
            else:
                if isZero:
                    return [0]*length
                isZero = True
                    
        
        lt = []
        for i in nums:
            if isZero:
                if i == 0:
                    lt.append(overallProd)
                else:
                    lt.append(0)
            else:
                lt.append(overallProd//i)
        
        return lt