class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        lt = ['()']

        def helper(lt):
            temp = set()
            for i in lt:
                temp.add('('+i+')')
                temp.add(i+'()')
                temp.add('()'+i)
                ind = i.find(')')
                while ind!= -1:
                    temp.add(i[:ind]+'()'+i[ind:])
                    ind = i.find(')',ind+1)
                    
            return list(temp)



        for _ in range(1,n):
            lt = helper(lt)
            print(lt)
        
        return lt

        