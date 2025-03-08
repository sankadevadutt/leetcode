class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        ans = 100
        num_whites = 0

        for i in range(k):
            if (blocks[i] == 'W'):
                num_whites += 1
        
        ans = min(ans, num_whites)
        if(ans == 0): return 0
        for i in range(k,len(blocks)):
            if (blocks[i - k] == 'W'):
                num_whites -= 1
            if (blocks[i] == 'W'):
                num_whites += 1
            ans = min(ans, num_whites)
            if(ans == 0): return 0
        
        return ans
        