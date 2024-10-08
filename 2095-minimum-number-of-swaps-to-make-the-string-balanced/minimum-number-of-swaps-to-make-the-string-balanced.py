class Solution:
    def minSwaps(self, s: str) -> int:
        stack = deque()
        unbalanced = 0
        for i in s:
            if i == '[':
                stack.append(i)
            else:
                if stack:
                    stack.pop()
                else:
                    unbalanced += 1
        
        return (unbalanced//2 if unbalanced % 2 == 0 else (unbalanced+1)//2)