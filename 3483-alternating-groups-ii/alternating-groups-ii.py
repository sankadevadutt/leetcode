class Solution:
    def numberOfAlternatingGroups(self, colors: List[int], k: int) -> int:
        for i in range(k-1):
            colors.append(colors[i])
        n = len(colors)

        count = 0

        l,r = 0, 1
        while(r < n):
            if colors[r] == colors[r-1]:
                l = r
                r += 1
                continue
            
            r += 1

            if r - l < k:
                continue
            
            count += 1
            l += 1


        return count