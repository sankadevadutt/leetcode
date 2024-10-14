class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        l, r = 0, len(s2)
        length = len(s1)

        def isPerm(s: str):
            return sorted(s) == sorted(s1) 

        while(l < r):
            while(l < r and s2[l] not in s1):
                l += 1
            if l == r:
                return False
            if l+length <= r:
                substr = s2[l:l+length]
                if(isPerm(substr)):
                    print(substr)
                    return True
            else:
                return False
            l += 1
        
        return False
            