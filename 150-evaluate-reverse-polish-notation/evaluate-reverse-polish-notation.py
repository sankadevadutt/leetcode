class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        operators = ["+","-",'/','*']
        for i in tokens:
            if i in operators:
                v1 = stack.pop()
                v2 = stack.pop()
                if i == '+':
                    stack.append(v2+v1)
                elif i == '-':
                    stack.append(v2-v1)
                elif i == '*':
                    stack.append(v2*v1)
                else:
                    val = abs(v2)//abs(v1)
                    if (v1<0) != (v2<0):
                        val = -val
                    stack.append(val)
            else:
                stack.append(int(i))
        
        return stack.pop()
        