class Solution:
    def maxUniqueSplit(self, s: str) -> int:
        ans = [0]
        sol = []
        length = len(s)
        def backtrack(i):
            if i == len(s):
                if len(sol) > ans[0]:
                    ans[0] = len(sol)
                return
            
            for end in range(length,i,-1):
                st = s[i:end]
                if st not in sol:
                    sol.append(st)
                    backtrack(end)
                    sol.remove(st)
                else:
                    return



        
        backtrack(0)

        return ans[0]
        