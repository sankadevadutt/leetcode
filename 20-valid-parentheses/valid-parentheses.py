class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        valid = {
            ')' : '(',
            ']' : '[',
            '}' : '{'
        }

        for ch in s:
            if ch == '(' or ch == '[' or ch == '{':
                stack.append(ch)
            else:
                if stack:
                    ch2 = stack.pop()
                    if valid[ch] != ch2:
                        return False
                else:
                    return False

        if stack:
            return False

        
        return True


        