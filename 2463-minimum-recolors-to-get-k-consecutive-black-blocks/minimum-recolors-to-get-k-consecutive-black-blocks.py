class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        l,r = 0, len(blocks)
        num_whites = 0
        ans = 100
        l2 = l

        while(l2 < r):
            while(l2 < r and (l2-l)<k):
                if(blocks[l2] == 'W'):
                    num_whites += 1
                l2 += 1
            ans = min(ans, num_whites)
            if(ans == 0): return 0
            if(blocks[l] == 'W'):
                num_whites -= 1
            l += 1

        return ans

        # ans = 100
        # num_whites = 0

        # for i in range(k):
        #     if (blocks[i] == 'W'):
        #         num_whites += 1
        
        # ans = min(ans, num_whites)
        # if(ans == 0): return 0
        # for i in range(k,len(blocks)):
        #     if (blocks[i - k] == 'W'):
        #         num_whites -= 1
        #     if (blocks[i] == 'W'):
        #         num_whites += 1
        #     ans = min(ans, num_whites)
        #     if(ans == 0): return 0
        
        # return ans
        

