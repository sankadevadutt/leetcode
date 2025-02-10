class Solution:
    def clearDigits(self, s: str) -> str:
        # lt = list(s)
        # left, right = 0, len(s)

        # while(left < right):
        #     while(left < right and not('0'<=lt[left]<='9')): left += 1
        #     if(left == right): break
        #     prev = left - 1
        #     while(prev >= 0 and not('a'<=lt[prev]<='z')): prev -=1
        #     if (prev < 0): break
        #     lt[prev] = ''
        #     lt[left] = ''
        #     prev -= 1
        #     left += 1
        #     print(prev, lt)
        
        # return ''.join(lt)

        # Using Stack
        lt = []
        for i in s:
            if 'a'<=i<='z':
                lt.append(i)
            else:
                lt.pop()
        return ''.join(lt)
        