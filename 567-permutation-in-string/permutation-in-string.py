class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        l, r = 0, len(s2)
        length = len(s1)
        arr2 = [0]*26
        for i in s1:
            arr2[ord(i) - ord('a')] += 1

        def isPerm(s: str):
            # return sorted(s) == sorted(s1)
            arr = arr2.copy()

            for i in s:
                arr[ord(i) - ord('a')] -= 1
            for i in arr:
                if i != 0:
                    return False
            return True

        while(l < r):
            while(l < r and s2[l] not in s1):
                l += 1
            if l == r:
                return False
            if l+length <= r:
                substr = s2[l:l+length]
                if(isPerm(substr)):
                    return True
            else:
                return False
            l += 1
        
        return False
            