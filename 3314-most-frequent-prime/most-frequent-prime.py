class Solution:
    def mostFrequentPrime(self, mat: List[List[int]]) -> int:
        ROWS, COLS = len(mat), len(mat[0])
        DIRECTIONS = [(i,j) for i in range(-1,2) for j in range(-1,2) if not(i == 0 and j == 0)]
        dic = {}

        def isPrime(num):
            if(num % 2 == 0): return False
            for i in range(3,isqrt(num)+1, 2):
                if num % i == 0:
                    return False
            return True

        
        for row in range(ROWS):
            for col in range(COLS):
                for rd, rc in DIRECTIONS:
                    num = mat[row][col]
                    nr, nc = row+rd, col+rc
                    while 0 <= nr < ROWS and 0 <= nc < COLS:
                        num = num*10 + mat[nr][nc]
                        if(num > 10):
                            if num not in dic:
                                dic[num] = 0
                            dic[num] += 1
                        nr, nc = nr+rd, nc+rc
        
        ans = -1
        count = 0
        for i in dic.keys():
            val = dic[i]
            if not isPrime(i):
                continue
            if val > count:
                ans = i
                count = val
            elif val == count:
                ans = max(ans, i)

        return ans
        
        
        
