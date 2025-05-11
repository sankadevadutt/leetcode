class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        n = len(arr)
        arr = [i%2 for i in arr]
        prefix = [0]*(n+1)
        for i in range(n):
            if (arr[i] == 0):
                prefix[i+1] = arr[i]
            else:
                prefix[i+1] = prefix[i]+arr[i]
            if (prefix[i+1] == 3):
                return True
        return False