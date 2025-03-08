class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ans = []

        i1,i2 = 0,0
        while(i1<m and i2<n):
            if nums1[i1] < nums2[i2]:
                ans.append(nums1[i1]) 
                i1 += 1
            else:
                ans.append(nums2[i2])
                i2 += 1
        while(i1<m):
            ans.append(nums1[i1])
            i1 += 1
        
        while(i2<n):
            ans.append(nums2[i2])
            i2+=1

        for i in range(m+n):
            nums1[i] = ans[i]