class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        # ans = [False]
        # used = []

        # def helper(i: int):
        #     if (i < 0): return False
        #     if (i == 0): return True
        #     for j in range(1+int(math.log(i,3))):
        #         if j in used:
        #             continue
        #         used.append(j)
        #         if (helper(i - 3**j)):
        #             ans[0] = True
        #         used.pop()

        # helper(n)

        # return ans[0]

        while (n > 0):
            if(n%3 == 2):
                return False
            n //= 3

        return True
        