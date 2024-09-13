class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        lt = [0]*26

        for char in allowed:
            lt[int(ord(char)-ord('a'))] = 1
        
        count = 0
        
        for i in words:
            flag = True
            for j in i:
                if lt[int(ord(j)-ord('a'))] != 1:
                    flag = False
                    break
            if flag:
                count += 1
            
        
        return count