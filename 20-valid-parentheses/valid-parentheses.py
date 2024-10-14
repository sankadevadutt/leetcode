class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        valid = {
            '(' : ')',
            '[' : ']',
            '{' : '}'
        }

        for ch in s:
            if ch in valid:
                stack.append(ch)
            elif stack and valid[stack[-1]] == ch:
                stack.pop()
            else:
                return False
                # if stack:
                #     ch2 = stack.pop()
                #     if valid[ch] != stack[-1]:
                #         return False
                # else:
                #     return False

        return not stack


        