class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        lt = ['()']

        def helper(lt):
            temp = set()
            for i in lt:
                temp.add('('+i+')')
                temp.add(i+'()')
                temp.add('()'+i)
                ind = i.index(')')
                while ind!= -1:
                    temp.add(i[:ind]+'()'+i[ind:])
                    try:
                        ind = i.index(')',ind+1)
                    except ValueError:
                        break
            
            return list(temp)



        for _ in range(1,n):
            lt = helper(lt)
            print(lt)
        
        return lt

        