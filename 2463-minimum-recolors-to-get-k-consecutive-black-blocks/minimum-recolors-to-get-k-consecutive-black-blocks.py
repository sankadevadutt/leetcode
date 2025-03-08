class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        l,r = 0, len(blocks)
        num_blacks = num_whites = 0
        ans = 100
        l2 = l

        while(l < r):
            while(l2 < r and (l2-l)<k):
                if(blocks[l2] == 'W'):
                    num_whites += 1
                else:
                    num_blacks += 1
                l2 += 1
            ans = min(ans, num_whites)
            if(ans == 0): return 0
            if(l2 == r): break
            if(blocks[l] == 'W'):
                num_whites -= 1
            else:
                num_blacks -= 1
            l += 1

        return ans
        

